package com.controller;


import com.pojo.FirstWorks;

import com.service.FirstWorksService;
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

public class FirstWorksController {


    private Logger logger = Logger.getLogger(FirstWorksController.class);

    @Resource
    private FirstWorksService firstWorksService;

    /**
     * 增加
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/first/works", method = RequestMethod.POST)
    public Map addFirstWorks(FirstWorks record) {
        logger.info("添加方法被调用");
        Map<String, Object> map = new HashMap();
        record.setCreatTime(new Timestamp(System.currentTimeMillis()));
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a = firstWorksService.insert(record);
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
    @RequestMapping(value = "/a/u/first/works/{id}", method = RequestMethod.DELETE)
    public Map deleteFirstWorks(@PathVariable Long id) {
        logger.info("----删除方法被调用-----");
        logger.info("：删除数据的id为" + id);
        Map<String, Object> map = new HashMap<>();
        int a = firstWorksService.deleteByPrimaryKey(id);
        if (a == 0) {
            map.put("code",0);
            map.put("message", "删除失败");
        } else {
            map.put("code",1);
            map.put("message", "删除成功");
        }
        return map;

    }

    /**
     * 查询
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/first/works/list", method = RequestMethod.GET)
    public Map getFirstWorks() {

        logger.info("开始查询");
        Map<String, Object> map = new HashMap<>();
        List<FirstWorks> firstWorks = firstWorksService.list();
        if (firstWorks == null || firstWorks.size() == 0) {
            map.put("code", 0);
            map.put("message", "查询失败");
        } else {
            map.put("code", 1);
            map.put("message", "查询成功");
            map.put("date", firstWorks);
        }
        logger.info(firstWorks);
        return map;
    }

    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return map
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/first/works", method = RequestMethod.GET)
    public Map<String, Object> selectFirstWorks(@RequestParam(value = "status", required = false) Integer status,
                                            @RequestParam(value = "worksName", required = false) String worksName) {
        logger.info("-----查询方法被调用-----");
        Map<String, Object> map = new HashMap<String, Object>();
        List<FirstWorks> firstWorks = firstWorksService.selectByCondition(status,worksName);
        if (firstWorks == null || firstWorks.size() == 0) {
            map.put("code", -1);
            map.put("message", "失败");
        } else {
            map.put("code", 1);
            map.put("message", "成功");
            map.put("data", firstWorks);
        }
        logger.info("：查询结果" + firstWorks);
        return map;
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/first/works", method = RequestMethod.PUT)
    public Map updateFirstWorks(FirstWorks record) {
        Map<String, Object> map = new HashMap<>();
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a = firstWorksService.updateByPrimaryKeySelective(record);
        if (a == 0) {
            map.put("code", 0);
            map.put("message", "更新失败");
        } else {
            map.put("code", 1);
            map.put("message", "更新成功");
        }
        return map;
    }
}


