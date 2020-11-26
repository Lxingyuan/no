package msgsys.dao;

import msgsys.entity.Message;

import java.util.List;

/**
 * 作者：林星源
 * 日期: 2020/11/26 14:23
 * 描述:
 */
public interface MessageDao {
    int insert(Message message);
    int update(Message message);
    int delete(Integer id);
    List<Message> queryAll();

}
