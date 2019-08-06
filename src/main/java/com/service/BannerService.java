package com.service;


import com.pojo.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface BannerService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Banner record);


    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);


    /**
     * 查询全表
     *
     * @param
     * @return
     */

    List<Banner> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * 多条件查询
     *
     * @return
     * @parameditor status
     * @paramstatus editor
     */
    List<Banner> selectByCondition(Integer status, String editor);
}
