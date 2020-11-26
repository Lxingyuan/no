package msgsys.dao;

import msgsys.entity.User;

import java.util.List;

/**
 * 作者：林星源
 * 日期: 2020/11/26 14:23
 * 描述:
 */
public interface UserDao {
    int insert(User user);
    int update(User user);
    int delete(Integer id);
    List<User> queryAll();
    User queryUserById(Integer id);
    User queryUserByNameAndPassWord(User user);


}
