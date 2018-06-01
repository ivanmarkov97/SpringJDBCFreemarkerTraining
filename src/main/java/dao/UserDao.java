package dao;

import entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    User getUserById(int id);
    List<User> findAll();
    void update(User user);
    void delete(int id);
}
