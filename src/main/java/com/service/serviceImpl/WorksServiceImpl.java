package com.service.serviceImpl;

import com.mapper.WorksMapper;
import com.pojo.Works;
import com.service.WorksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Resource
    private WorksMapper worksMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Works record) {
        return worksMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return worksMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Works> list() {
        return worksMapper.list();
    }

    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Works record) {
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return
     */
    @Override
    public List<Works> selectByCondition(Integer status, String worksName) {
        return worksMapper.selectByCondition(status, worksName);
    }


}
