package com.service.serviceImpl;


import com.pojo.SecondWorks;
import com.service.SecondWorksService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class SecondWorksServiceImplTest {
    @Resource
    private SecondWorksService secondWorksService;
    Logger logger = Logger.getLogger(ModuleServiceImplTest.class);
    SecondWorks secondWorks = new SecondWorks();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        secondWorks.setWorksName("梦雨铜像");
        secondWorks.setBelongFirst("架上绘画装置");
        secondWorks.setFirstId(1L);
        secondWorks.setStatus(0);
        secondWorks.setCreateTime(new Timestamp(System.currentTimeMillis()));
        secondWorks.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        secondWorks.setEditor("姜子牙");
        secondWorksService.insert(secondWorks);

    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        secondWorksService.deleteByPrimaryKey(2L);
    }

    /**
     * 查询全表
     */
    @Test
    public void testList() {
        secondWorksService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        secondWorks.setId(2L);
        secondWorks.setWorksName("梦雨铜像");
//        secondWorks.setBelongFirst("架上绘画装置");
//        secondWorks.setStatus(0);
        secondWorks.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        secondWorks.setEditor("姜牙");
        secondWorksService.updateByPrimaryKeySelective(secondWorks);
    }

    /**
     * 双条件查找
     */
    @Test
    public void selectByCondition() {
        logger.info(secondWorksService.selectByCondition(0, ""));
    }

}