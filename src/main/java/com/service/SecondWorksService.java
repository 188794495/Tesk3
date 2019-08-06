package com.service;

import com.pojo.SecondWorks;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface SecondWorksService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(SecondWorks record);


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

    List<SecondWorks> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SecondWorks record);


    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return
     */
    List<SecondWorks> selectByCondition(Integer status, String worksName);


}
