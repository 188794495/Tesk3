package com.mapper;

import com.pojo.Account;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface AccountMapper {

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     *插入
     * @param record
     * @return
     */
    int insert(Account record);

    /**
     *动态插入
     * @param record
     * @return
     */
    int insertSelective(Account record);


    /**
     *条件查询
     * @param accountName
     * @param role
     * @return
     */
     List<Account> selectByCondition(@Param("accountName") String accountName,@Param("role") String role);

    /**
     * 动态更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * 查询全表
     *
     * @return
     */
    List<Account> list();




}