package com.service.serviceImpl;


import com.pojo.Studio;
import com.service.StudioService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class StudioServiceImplTest {

    @Resource
    private StudioService studioService;
    Logger logger = Logger.getLogger(StudioServiceImplTest.class);
    Studio studio = new Studio();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        studio.setStudioName("工作室简介");
        studio.setStatus(0);
        studio.setCreateTime(new Timestamp(System.currentTimeMillis()));
        studio.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        studio.setEditor("姜子牙");
        studioService.insert(studio);
    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        studioService.deleteByPrimaryKey(2L);
    }

    /**
     * 查询全表
     */
    @Test
    public void testList() {
        studioService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        studio.setId(2L);
//        studio.setStudioName("工作室简介");
//        studio.setStatus(0);
        studio.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        studio.setEditor("姜牙");
        studioService.updateByPrimaryKeySelective(studio);
    }

    /**
     * 双条件查找
     */
    @Test
    public void selectByCondition() {
        logger.info(studioService.selectByCondition(0, "大"));
    }


}