package cn.hust.service.impl;

import cn.hust.dao.UserInfoDao;
import cn.hust.entity.UserInfo;
import cn.hust.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {


}
