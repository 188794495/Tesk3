package com.mapper;

import com.pojo.Studio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface StudioMapper {


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
    int insert(Studio record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(Studio record);


    /**
     * 查询全表
     *
     * @return
     */
    List<Studio> list();

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Studio record);

    /**
     * 条件查询
     *
     * @param status
     * @param studioName
     * @return
     */
    List<Studio> selectByCondition(@Param("status") Integer status, @Param("studioName") String studioName);
}