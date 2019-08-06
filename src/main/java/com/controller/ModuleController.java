package com.controller;

import com.pojo.Module;
import com.service.ModuleService;
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

public class ModuleController {


    private Logger logger = Logger.getLogger(ModuleController.class);

    @Resource
    private ModuleService moduleService;

    /**
     * 增加
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/module", method = RequestMethod.POST)
    public Map addModule(Module record) {
        logger.info("添加方法被调用");
        Map<String, Object> map = new HashMap();
        record.setCreateTime(new Timestamp(System.currentTimeMillis()));
        int a = moduleService.insert(record);
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
    @RequestMapping(value = "/a/u/module/{id}", method = RequestMethod.DELETE)
    public Map deleteModule(@PathVariable Long id) {
        logger.info("----删除方法被调用-----");
        logger.info("：删除数据的id为" + id);
        Map<String, Object> map = new HashMap<>();
        int a = moduleService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "/a/u/module/list", method = RequestMethod.GET)
    public Map getModule(){

        logger.info("开始查询");

        Map<String, Object> map = new HashMap<>();

        List<Module> modules=moduleService.list();
        if (modules == null || modules.size() == 0) {
            map.put("code",0);
            map.put("message", "查询失败");
        } else {
            map.put("code",1);
            map.put("message", "查询成功");
            map.put("date",modules);
        }
        logger.info("：查询结果" +modules);

        return map;
    }

    /**
     * 条件查询
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/module/", method = RequestMethod.GET)
    public Map selectAccount(@RequestParam(value = "moduleName", required = false) String moduleName) {
        logger.info("开始查询");
        Map<String, Object> map = new HashMap<>();
        List<Module> modules = moduleService.selectByName(moduleName);
        if (modules == null || modules.size() == 0) {
            map.put("code", 0);
            map.put("massage", "查询失败");
        } else {
            map.put("code", 1);
            map.put("message", "查询成功");
            map.put("date", modules);
        }
        logger.info("查询结果" + modules);

        return map;
    }

    /**
     * 修改
     * @param record
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/a/u/module",method = RequestMethod.PUT)
    public Map updateModule(Module record){
        logger.info("开始更新");
        Map<String,Object>map =new HashMap<>();
        int a=moduleService.updateByPrimaryKeySelective(record);
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
