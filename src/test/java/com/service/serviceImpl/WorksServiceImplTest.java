package com.service.serviceImpl;


import com.pojo.Works;
import com.service.WorksService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})


public class WorksServiceImplTest {
    @Resource
    private WorksService worksService;
    Logger logger = Logger.getLogger(WorksServiceImplTest.class);
    Works works = new Works();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        works.setWorksName("梵高的大脚");
        works.setBelongFirst("架上绘画装置");
        works.setBelongSecond("梦雨铜像");
        works.setStatus(0);
        works.setSecondId(1L);
        works.setCreatTime(new Timestamp(System.currentTimeMillis()));
        works.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        works.setEditor("姜子牙");
        worksService.insert(works);
    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        worksService.deleteByPrimaryKey(2L);
    }

    /**
     * 查询全表
     */
    @Test
    public void testList() {
        worksService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        works.setId(2L);
        works.setWorksName("梵高的啤酒肚");
//        works.setBelongFirst("架上绘画装置");
//        works.setBelongSecond("梦雨铜像");
        works.setStatus(0);
        works.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        works.setEditor("姜子牙");
        worksService.updateByPrimaryKeySelective(works);
    }

    /**
     * 双条件查找
     */
    @Test
    public void selectByCondition() {
        logger.info(worksService.selectByCondition(1, ""));
    }
}