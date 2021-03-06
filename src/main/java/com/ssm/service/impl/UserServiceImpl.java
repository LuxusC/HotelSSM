package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

/**
 * 
 * @author Luxus_C
 * @version $Id: UserService.java, v 0.1 2017年10月20日 下午8:47:11 Luxus_C Exp $
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    /** 
     * @see com.ssm.service.UserService#getUserById(int)
     */
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}