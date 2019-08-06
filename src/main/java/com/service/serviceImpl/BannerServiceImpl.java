package com.service.serviceImpl;

import com.mapper.BannerMapper;
import com.pojo.Banner;
import com.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Resource
    private BannerMapper bannerMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Banner record) {
        return bannerMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Banner> list() {
        return bannerMapper.list();
    }

    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 双条件查询
     * @param status
     * @param editor
     * @return
     */
    @Override
    public List<Banner> selectByCondition(Integer status,String editor) {
        return bannerMapper.selectByCondition(status, editor);
    }
}
