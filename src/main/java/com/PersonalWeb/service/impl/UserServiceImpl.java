package com.PersonalWeb.service.impl;

import com.PersonalWeb.entity.User;
import com.PersonalWeb.mapper.UserMapper;
import com.PersonalWeb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2023-11-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
