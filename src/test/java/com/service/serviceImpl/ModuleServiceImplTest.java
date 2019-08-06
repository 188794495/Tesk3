package com.service.serviceImpl;


import com.pojo.Module;
import com.service.ModuleService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ModuleServiceImplTest {
    @Resource
    private ModuleService moduleService;
    Logger logger = Logger.getLogger(ModuleServiceImplTest.class);
    Module module = new Module();

    /**
     * 增加
     */
    @Test
    public void testInsert() {
        module.setModuleName("留言管理");
        module.setFatherId(10086L);
        module.setUrl("com");
        module.setCreateTime(new Timestamp(System.currentTimeMillis()));
        module.setCreator("admin");
        moduleService.insert(module);

    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        moduleService.deleteByPrimaryKey(2L);
    }


    @Test
    public void testList() {
        moduleService.list();
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        module.setId(2L);
        module.setModuleName("留言管理");
//        module.setFatherId(10086L);
//        module.setUrl("com");
        module.setCreator("caofeifan");
        moduleService.updateByPrimaryKeySelective(module);

    }

    /**
     * 根据名字查询
     */
    @Test
    public void selectByName() {
        logger.info(moduleService.selectByName("留"));
    }
}