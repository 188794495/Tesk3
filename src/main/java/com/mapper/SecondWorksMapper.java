package com.mapper;

import com.pojo.SecondWorks;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface SecondWorksMapper {


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
    int insert(SecondWorks record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(SecondWorks record);

    /**
     * 查询全表
     *
     * @return
     */
    List<SecondWorks> list();

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SecondWorks record);

    /**
     * 条件查询
     *
     * @param status
     * @param worksName
     * @return
     */
    List<SecondWorks> selectByCondition(@Param("status") Integer status, @Param("worksName") String worksName);


}