package com.controller;

import com.pojo.FirstWorks;
import com.pojo.Message;
import com.service.FirstWorksService;
import com.service.MessageService;
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

public class MessageController {


    private Logger logger = Logger.getLogger(MessageController.class);

    @Resource
    private MessageService messageService;


    /**
     * 增加
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/message", method = RequestMethod.POST)
    public Map addMessage(Message record) {
        logger.info("添加方法被调用");
        Map<String, Object> map = new HashMap();
        record.setMessageTime(new Timestamp(System.currentTimeMillis()));
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a = messageService.insert(record);
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
    @RequestMapping(value = "/a/u/message/{id}", method = RequestMethod.DELETE)
    public Map deleteMessage(@PathVariable Long id) {
        logger.info("----删除方法被调用-----");
        logger.info("：删除数据的id为" + id);
        Map<String, Object> map = new HashMap<>();
        int a = messageService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "/a/u/message/list", method = RequestMethod.GET)
    public Map getMessage(){

        logger.info("开始查询");

        Map<String, Object> map = new HashMap<>();

        List<Message> messages=messageService.list();
        if (messages == null || messages.size() == 0) {
            map.put("code",0);
            map.put("message", "查询失败");
        } else {
            map.put("code",1);
            map.put("message", "查询成功");
            map.put("date",messages);
        }
        logger.info("：查询结果" +messages);

        return map;
    }

    /**
     * 多条件查询
     * @param status
     * @param worksTitle
     * @return map
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/message", method = RequestMethod.GET)
    public Map<String, Object> selectMessage(@RequestParam(value = "status", required = false) Integer status,
                                             @RequestParam(value = "worksTitle", required = false) String worksTitle) {
        logger.info("-----查询方法被调用-----");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Message> message = messageService.selectByCondition(status,worksTitle);
        if (message == null || message.size() == 0) {
            map.put("code", -1);
            map.put("message", "失败");
        } else {
            map.put("code", 1);
            map.put("message", "成功");
            map.put("data", message);
        }
        logger.info("：查询结果" + message);
        return map;
    }


    /**
     * 修改
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/message",method = RequestMethod.PUT)
    public Map updateMessage(Message record){
        logger.info("开始更新");
        Map<String,Object>map =new HashMap<>();
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int a=messageService.updateByPrimaryKeySelective(record);
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


