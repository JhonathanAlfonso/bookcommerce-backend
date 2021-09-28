package com.salajhon69.bookcommerce.service;


import com.salajhon69.bookcommerce.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
