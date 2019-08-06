package com.service.serviceImpl;

import com.pojo.Banner;
import com.service.BannerService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class BannerServiceImplTest {

    Logger logger = Logger.getLogger(BannerServiceImplTest.class);
    @Resource
    private BannerService bannerService;
    Banner banner = new Banner();

    /**
     * 增加
     */
    @Test
    public void testInsert() {

        banner.setBannerCover("图片");
        banner.setEditor("德华");
        banner.setUrl("com");
        banner.setStatus(1);
        banner.setCreatTime(new Timestamp(System.currentTimeMillis()));
        banner.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        bannerService.insert(banner);

    }

    /**
     * 删除
     */
    @Test
    public void testDeleteByPrimaryKey() {
        bannerService.deleteByPrimaryKey(1L);
    }


    /**
     * 查询全表
     */
    @Test
    public void testList() {
        bannerService.list();
    }


    /**
     * 双条件查找
     */
    @Test
    public void selectByCondition() {
        bannerService.selectByCondition(null, "德");
    }


    /**
     * 修改
     */
    @Test
    public void testUpdateByPrimaryKey() {
        banner.setId(4L);
        banner.setBannerCover("少女");
        banner.setEditor("杰伦");
//        banner.setStatus(0);
        banner.setUrl("cn.123");
        banner.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        bannerService.updateByPrimaryKeySelective(banner);
    }
}