package dao.repository;

import entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UserRepository extends Repository<User, Long> {
    List<User> findAll();
}
