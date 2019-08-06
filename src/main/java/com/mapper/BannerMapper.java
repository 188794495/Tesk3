package com.mapper;

import com.pojo.Banner;
import com.pojo.BannerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface BannerMapper {


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
    int insert(Banner record);

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    int insertSelective(Banner record);

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * @return
     */
    List<Banner> list();

    /**
     * 条件查询
     *
     * @param status
     * @param editor
     * @return
     */
    List<Banner> selectByCondition(@Param("status") Integer status, @Param("editor") String editor);
}