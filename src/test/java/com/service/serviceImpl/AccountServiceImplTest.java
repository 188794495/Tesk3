package com.service.serviceImpl;

import com.pojo.Account;
import com.service.AccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class AccountServiceImplTest {
    Logger logger = Logger.getLogger(AccountServiceImplTest.class);
    @Resource
    private AccountService accountService;
    Account account = new Account();

    /**
     * 增加
     */
    @Test
    public void testInsert() {

        account.setAccountName("梵高");
        account.setPassword("123456");
        account.setRole("市场");
        account.setCreateTime(new Timestamp(System.currentTimeMillis()));
        account.setCreator("齐白石");
        accountService.insert(account);
    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        accountService.deleteByPrimaryKey(1L);
    }

    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKeySelective() {
        account.setId(6L);
//        account.setAccountName("哪吒");
//        account.setPassword("654321");
        account.setRole("莫特");
        account.setCreator("尼采");
        accountService.updateByPrimaryKeySelective(account);
    }


    /**
     * 查询全表
     */
    @Test
    public void testList() {
        logger.info(accountService.list());
    }

    /**
     * 双条件查询
     */
    @Test
    public void selectByCondition() {
        logger.info(accountService.selectByCondition("", null));
    }

}