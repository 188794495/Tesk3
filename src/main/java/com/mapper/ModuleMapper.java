package com.mapper;

import com.pojo.Module;

import java.util.List;

/**
 * @author Administrator
 */
public interface ModuleMapper {


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
    int insert(Module record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(Module record);

    /**
     * 查询全表
     *
     * @return
     */
    List<Module> list();


    /**
     * 条件查询
     *
     * @param moduleName
     * @return
     */
    List<Module> selectByName(String moduleName);

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Module record);

}