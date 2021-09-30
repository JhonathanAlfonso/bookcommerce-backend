package com.salajhon69.bookcommerce.service;

import com.salajhon69.bookcommerce.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User sigInRequest);
}
