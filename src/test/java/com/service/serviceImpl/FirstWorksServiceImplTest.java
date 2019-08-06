package com.service.serviceImpl;

import com.pojo.FirstWorks;
import com.service.FirstWorksService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class FirstWorksServiceImplTest {

    @Resource
    private FirstWorksService firstWorksService;

    Logger logger = Logger.getLogger(FirstWorksServiceImplTest.class);
    FirstWorks firstWorks = new FirstWorks();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        firstWorks.setWorksName("架上绘画装置");
        firstWorks.setStatus(0);
        firstWorks.setCreatTime(new Timestamp(System.currentTimeMillis()));
        firstWorks.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        firstWorks.setEditor("姜子牙");
        firstWorksService.insert(firstWorks);

    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        firstWorksService.deleteByPrimaryKey(3L);
    }


    /**
     * 查询全表
     */
    @Test
    public void testList() {
        firstWorksService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        firstWorks.setId(2L);
//        firstWorks.setWorksName("架上绘画装置");
//        firstWorks.setStatus(0);
        firstWorks.setEditor("姜牙");
        firstWorks.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        firstWorksService.updateByPrimaryKeySelective(firstWorks);
    }


    /**
     * 多条件查询
     */
    @Test
    public void selectByCondition() {
        firstWorksService.selectByCondition(0, "架");
    }
}