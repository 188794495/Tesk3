package com.service;

import com.pojo.Module;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface ModuleService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Module record);


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

    List<Module> list();

    /**
     * 根据名字查询
     *
     * @param moduleName
     * @return
     */
    List<Module> selectByName(String moduleName);


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Module record);

}


