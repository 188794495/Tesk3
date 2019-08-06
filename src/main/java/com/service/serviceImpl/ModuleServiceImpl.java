package com.service.serviceImpl;

import com.mapper.ModuleMapper;
import com.pojo.Module;
import com.service.ModuleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Resource
    private ModuleMapper moduleMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Module record) {
        return moduleMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return moduleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Module> list() {
        return moduleMapper.list();
    }


    /**
     * 根据名字查询
     *
     * @param moduleName
     * @return
     */
    @Override
    public List<Module> selectByName(@Param("moduleName") String moduleName) {
        return moduleMapper.selectByName(moduleName);
    }


    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Module record) {
        return moduleMapper.updateByPrimaryKeySelective(record);
    }


}
