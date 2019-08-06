package com.service.serviceImpl;

import com.mapper.MessageMapper;
import com.pojo.Message;
import com.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;


    /**
     * 增加
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询全表
     */
    @Override
    public List<Message> list() {
        return messageMapper.list();
    }


    /**
     * 修改
     */
    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }


    /**
     * 多条件查询
     * @param status
     * @param worksTitle
     * @return
     */
    @Override
    public List<Message> selectByCondition(Integer status, String worksTitle) {
        return messageMapper.selectByCondition(status, worksTitle);
    }


}
