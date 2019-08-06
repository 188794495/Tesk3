package com.controller;


import com.pojo.Account;
import com.service.AccountService;
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

public class AccountController {

    private Logger logger = Logger.getLogger(AccountController.class);

    @Resource
    private AccountService accountService;


    /**
     * 增加
     * @param record
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/a/u/account", method = RequestMethod.POST)
    public Map addAccount(Account record) {
        logger.info("添加方法被调用");
        Map<String, Object> map = new HashMap();
        record.setCreateTime(new Timestamp(System.currentTimeMillis()));
        record.setAccountName("孙悟空");
        record.setPassword("997521");
        record.setRole("营销");
        record.setCreator("曹非凡");
        int a = accountService.insert(record);
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
    @RequestMapping(value = "/a/u/account/{id}", method = RequestMethod.DELETE)

    public Map deleteAccount(@PathVariable Long id) {

        logger.info("----删除方法被调用-----");
        logger.info("：删除数据的id为" + id);
        Map<String, Object> map = new HashMap<>();
        int a = accountService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "/a/u/account/list", method = RequestMethod.GET)
    public Map getAccount() {

        logger.info("开始查询");

        Map<String, Object> map = new HashMap<>();
        List<Account> account = accountService.list();
        if (account == null || account.size() == 0) {
            map.put("code", 0);
            map.put("message", "查询失败");
        } else {
            map.put("code", 1);
            map.put("message", "查询成功");
            map.put("date", account);
        }

        logger.info("：查询结果" + account);

        return map;
    }

    /**
     * 条件查询
     * @param
     * @return
    */
    @ResponseBody
    @RequestMapping(value = "/a/u/account", method = RequestMethod.GET)
    public Map selectAccount(@RequestParam(value = "accountName", required = false) String accountName,
                             @RequestParam(value = "role", required = false) String role) {
        logger.info("开始查询");
        Map<String, Object> map = new HashMap<>();
        List<Account> accounts = accountService.selectByCondition(accountName,role);
        if (accounts == null || accounts.size() == 0) {
            map.put("code", 0);
            map.put("massage", "查询失败");
        } else {
            map.put("code", 1);
            map.put("message", "查询成功");
            map.put("date", accounts);
        }
        logger.info("查询结果" + accounts);

        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/a/u/account", method = RequestMethod.PUT)
    public Map updateAccount(Account record) {
        logger.info("开始更新");
        Map<String, Object> map = new HashMap<>();
        int a = accountService.updateByPrimaryKeySelective(record);
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
