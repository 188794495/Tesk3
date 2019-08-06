package com.service;

import com.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public interface AccountService {
    /**
     * 增加
     *
     * @param record
     */
    int insert(Account record);


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

    List<Account> list();


    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * 多条件查询
     *
     * @param accountName
     * @param role
     * @return
     */
    List<Account> selectByCondition(String accountName, String role);
}
