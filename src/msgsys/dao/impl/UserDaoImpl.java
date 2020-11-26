package msgsys.dao.impl;

import msgsys.dao.BaseDao;
import msgsys.dao.UserDao;
import msgsys.entity.User;

import java.util.List;

/**
 * 作者：林星源
 * 日期: 2020/11/26 14:24
 * 描述:
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int insert(User user) {
        String sql ="INSERT INTO 'T_user'('username','password','email') VALUES (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int update(User user) {
        String sql="UPDATE 'T_user' SET 'username'=?,'password'=?,'email'=? WHERE 'id' =?";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql="DELETE FROM 'T_user' WHERE 'id'=?";
        return update(sql,id);
    }

    @Override
    public List<User> queryAll() {
        String sql="SELECT * FROM 'T_user'";
        return queryForList(User.class,sql);
    }

    @Override
    public User queryUserById(Integer id) {
        String sql="SELECT * FROM 'T_user' WHERE 'id'=?";
        return queryForOne(User.class,sql,id);
    }

    @Override
    public User queryUserByNameAndPassWord(User user) {
        String sql="SELECT * FROM 'T_user' WHERE 'username'=? AND 'password'=?";
        return queryForOne(User.class,sql,user.getUsername(),user.getPassword());
    }
}
