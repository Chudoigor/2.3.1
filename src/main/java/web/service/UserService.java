package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void add(User user);
    boolean update(User user);
    boolean removeById(Long id);
    List<User> findAll();
    Optional<User> findById(Long id);
}
