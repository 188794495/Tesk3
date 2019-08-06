package com.service;

import com.pojo.Studio;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface StudioService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Studio record);


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

    List<Studio> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Studio record);


    /**
     *多条件查询
     * @param status
     * @param studioName
     * @return
     */
    List<Studio> selectByCondition(Integer status, String studioName);
}
