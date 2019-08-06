package com.service.serviceImpl;

import com.mapper.AccountMapper;
import com.pojo.Account;
import com.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Account record) {
        return accountMapper.insert(record);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return accountMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Account> list() {
        return accountMapper.list();
    }


    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return accountMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 双条件查找
     *
     * @param accountName
     * @param role
     * @return
     */
    @Override
    public List<Account> selectByCondition(String accountName, String role) {

        return accountMapper.selectByCondition(accountName, role);
    }


}
