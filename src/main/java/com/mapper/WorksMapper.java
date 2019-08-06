package com.mapper;

import com.pojo.Works;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author Administrator
 */
public interface WorksMapper {


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
    int insert(Works record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(Works record);

    /**
     * 查询全表
     *
     * @return
     */
    List<Works> list();

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Works record);

    /**
     * 条件查询
     *
     * @param status
     * @param worksName
     * @return
     */
    List<Works> selectByCondition(@Param("status") Integer status, @Param("worksName") String worksName);


}