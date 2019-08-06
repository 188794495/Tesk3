package com.service;

import com.pojo.FirstWorks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FirstWorksService {

    /**
     * 增加
     * @param record
     */
    int insert(FirstWorks record);


    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);



    /**
     * 查询全表
     * @param
     * @return
     */

    List<FirstWorks> list();



    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(FirstWorks record);


    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return
     */
    List<FirstWorks> selectByCondition(Integer status, String worksName);
}
