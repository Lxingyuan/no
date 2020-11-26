package msgsys.dao.impl;

import msgsys.dao.MessageDao;
import msgsys.entity.Message;

import java.util.List;

/**
 * 作者：林星源
 * 日期: 2020/11/26 14:24
 * 描述:
 */
public class MessageDaoImpl implements MessageDao {
    @Override
    public int insert(Message message) {
        String sql ="INSERT";
        return 0;
    }

    @Override
    public int update(Message message) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public List<Message> queryAll() {
        return null;
    }
}
