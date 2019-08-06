package com.service.serviceImpl;

import com.mapper.StudioMapper;
import com.pojo.Studio;
import com.service.StudioService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudioServiceImpl implements StudioService {
    @Resource
    private StudioMapper studioMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Studio record) {
        return studioMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return studioMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Studio> list() {
        return studioMapper.list();
    }


    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Studio record) {
        return studioMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 多条件查询
     * @param status
     * @param studioName
     * @return
     */
    @Override
    public List<Studio> selectByCondition(Integer status, String studioName) {
        return studioMapper.selectByCondition(status, studioName);
    }


}
