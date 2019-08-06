package com.service;


import com.pojo.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Message record);


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

    List<Message> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Message record);


    /**
     * 多条件查询
     * @param status
     * @param worksTitle
     * @return
     */
    List<Message> selectByCondition(Integer status, String worksTitle);

}
