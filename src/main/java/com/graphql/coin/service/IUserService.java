
package com.graphql.coin.service;

import com.graphql.coin.graphql.inputs.UserInput;
import com.graphql.coin.model.entity.User;

import java.util.List;

public interface IUserService {

    User findByEmail(String email);

    List<User> allUser();

    User createUser(UserInput input);
}
