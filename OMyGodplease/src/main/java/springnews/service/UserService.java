package springnews.service;

import springnews.model.User;


public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
