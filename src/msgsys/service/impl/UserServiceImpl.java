package msgsys.service.impl;

import msgsys.dao.UserDao;
import msgsys.dao.impl.UserDaoImpl;
import msgsys.entity.User;
import msgsys.service.UserService;

/**
 * 作者：林星源
 * 日期: 2020/11/26 15:24
 * 描述:
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public int register(User user) {
        return userDao.insert(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByNameAndPassWord(user);
    }
}
