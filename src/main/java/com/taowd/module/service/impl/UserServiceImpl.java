package com.taowd.module.service.impl;

import com.taowd.module.entity.User;
import com.taowd.module.mapper.UserMapper;
import com.taowd.module.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Taoweidong
 * @since 2019-08-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
