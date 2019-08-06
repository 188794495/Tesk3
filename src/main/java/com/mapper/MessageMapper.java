package com.mapper;

import com.pojo.Message;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface MessageMapper {


    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(Message record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(Message record);

    /**
     * 查询全表
     *
     * @return
     */
    List<Message> list();

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * 条件查询
     *
     * @param status
     * @param worksTitle
     * @return
     */
    List<Message> selectByCondition(@Param("status") Integer status, @Param("worksTitle") String worksTitle);


}