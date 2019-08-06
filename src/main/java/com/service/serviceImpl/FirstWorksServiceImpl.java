package com.service.serviceImpl;


import com.mapper.FirstWorksMapper;
import com.pojo.FirstWorks;
import com.service.FirstWorksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class FirstWorksServiceImpl implements FirstWorksService {

    @Resource
    private FirstWorksMapper firstWorksMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(FirstWorks record) {
        return firstWorksMapper.insertSelective(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return firstWorksMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<FirstWorks> list() {
        return firstWorksMapper.list();
    }


    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(FirstWorks record) {
        return firstWorksMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 多条件查询
     *
     * @param status
     * @param worksName
     * @return
     */
    @Override
    public List<FirstWorks> selectByCondition(Integer status, String worksName) {
        return firstWorksMapper.selectByCondition(status, worksName);
    }


}
