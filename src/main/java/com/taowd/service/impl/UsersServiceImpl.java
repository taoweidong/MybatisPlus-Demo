package com.taowd.service.impl;

import com.taowd.entity.Users;
import com.taowd.mapper.UsersMapper;
import com.taowd.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Taoweidong
 * @since 2019-06-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
