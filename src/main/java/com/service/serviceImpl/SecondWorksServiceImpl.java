package com.service.serviceImpl;

import com.mapper.SecondWorksMapper;
import com.pojo.SecondWorks;
import com.service.SecondWorksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SecondWorksServiceImpl implements SecondWorksService {
    @Resource
    private SecondWorksMapper secondWorksMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(SecondWorks record) {
        return secondWorksMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return secondWorksMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<SecondWorks> list() {
        return secondWorksMapper.list();
    }


    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(SecondWorks record) {
        return secondWorksMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 多条件查询
     * @param status
     * @param worksName
     * @return
     */
    @Override
    public List<SecondWorks> selectByCondition(Integer status, String worksName) {
        return secondWorksMapper.selectByCondition(status, worksName);
    }


}
