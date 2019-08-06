package com.controller;

import com.pojo.Account;
import com.pojo.Banner;
import com.service.AccountService;
import com.service.BannerService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * 提示这是一个控制器类
 */
@Controller
//路径前置地址
@RequestMapping("")
public class BannerController {


    private Logger logger = Logger.getLogger(BannerController.class);

    @Resource
    private BannerService bannerService;


    /**
     * 增加
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/banner", method = RequestMethod.POST)
    public Map addBanner(Banner record) {
        logger.info("添加方法被调用");
        Map<String, Object> map = new HashMap();
        record.setCreatTime(new Timestamp(System.currentTimeMillis()));
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a = bannerService.insert(record);
        if (a == 0) {
            map.put("code", 0);
            map.put("message", "添加失败");
        } else {
            map.put("code", 1);
            map.put("message", "添加成功");
        }
        return map;
    }

    /**
     * @param id
     * @return map
     * @根据id删除
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/banner/{id}", method = RequestMethod.DELETE)
    public Map deleteBanner(@PathVariable Long id) {
        logger.info("----删除方法被调用-----");
        logger.info("：删除数据的id为" + id);
        Map<String, Object> map = new HashMap<>();
        int a = bannerService.deleteByPrimaryKey(id);
        if (a == 0) {
            map.put("code", 0);
            map.put("message", "删除失败");
        } else {
            map.put("code", 1);
            map.put("message", "删除成功");
        }
        return map;

    }

    /**
     * 查询全表
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/banner/list", method = RequestMethod.GET)
    public Map getBanner(){

        logger.info("开始查询");

        Map<String, Object> map = new HashMap<>();

        List<Banner> banner=bannerService.list();
        if (banner == null || banner.size() == 0) {
            map.put("code",0);
            map.put("message", "查询失败");
        } else {
            map.put("code",1);
            map.put("message", "查询成功");
            map.put("date",banner);
        }
        logger.info("：查询结果" + banner);

        return map;
    }
    /**
     * 条件查询
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/banner", method = RequestMethod.GET)
    public Map selectAccount(@RequestParam(value = "status", required = false) Integer status,
                             @RequestParam(value = "editor", required = false) String editor) {
        logger.info("开始查询");
        Map<String, Object> map = new HashMap<>();
        List<Banner> banners = bannerService.selectByCondition(status,editor);
        if (banners == null || banners.size() == 0) {
            map.put("code", 0);
            map.put("massage", "查询失败");
        } else {
            map.put("code", 1);
            map.put("message", "查询成功");
            map.put("date", banners);
        }
        logger.info("查询结果" + banners);

        return map;
    }


    /**
     * 修改
     * @param record
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/a/u/banner",method = RequestMethod.PUT)
    public Map updateBanner(Banner record){
        logger.info("开始更新");
        Map<String,Object>map =new HashMap<>();
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a=bannerService.updateByPrimaryKeySelective(record);

        if(a == 0){
            map.put("code",0);
            map.put("message","更新失败");
        }else {
            map.put("code",1);
            map.put("message","更新成功");
        }

        return map;

    }
}
