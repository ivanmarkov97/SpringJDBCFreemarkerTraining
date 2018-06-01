package service;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(int id) {

    }
}
