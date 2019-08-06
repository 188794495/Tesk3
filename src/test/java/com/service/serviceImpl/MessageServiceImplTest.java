package com.service.serviceImpl;

import com.pojo.Message;
import com.service.MessageService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class MessageServiceImplTest {
    @Resource
    private MessageService messageService;
    Logger logger = Logger.getLogger(MessageServiceImplTest.class);
    Message message = new Message();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        message.setWorksTitle("哪吒闹海");
        message.setAuthor("哪吒");
        message.setStatus(0);
        message.setMessageTime(new Timestamp(System.currentTimeMillis()));
        message.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        message.setEditor("admin");
        messageService.insert(message);
    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        messageService.deleteByPrimaryKey(2L);
    }


    @Test
    public void testList() {
        messageService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        message.setId(1L);
//        message.setWorksTitle("哪吒闹海");
//        message.setAuthor("哪吒");
        message.setStatus(1);
        message.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        message.setEditor("admin");
        messageService.updateByPrimaryKeySelective(message);
    }

    /**
     * 多条件查询
     */
    @Test
    public void selectByCondition() {
        logger.info(messageService.selectByCondition(0, null));
    }
}