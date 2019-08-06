package com.service;


import com.pojo.Works;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface WorksService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Works record);


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

    List<Works> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Works record);


    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return
     */
    List<Works> selectByCondition(Integer status, String worksName);


}
