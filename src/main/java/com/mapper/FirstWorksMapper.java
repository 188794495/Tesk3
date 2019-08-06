package com.mapper;

import com.pojo.FirstWorks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface FirstWorksMapper {


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
    int insert(FirstWorks record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(FirstWorks record);


    /**
     * 查询全表
     *
     * @return
     */
    List<FirstWorks> list();

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(FirstWorks record);


    /**
     * 条件查询
     *
     * @param status
     * @param worksName
     * @return
     */
    List<FirstWorks> selectByCondition(@Param("status") Integer status, @Param("worksName") String worksName);
}