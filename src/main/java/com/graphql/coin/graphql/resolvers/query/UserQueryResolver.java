package com.graphql.coin.graphql.resolvers.query;

import com.graphql.coin.model.entity.User;
import com.graphql.coin.service.IUserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQueryResolver implements GraphQLQueryResolver {
    private final IUserService userService;

    public User userByEmail(String email) {
        return userService.findByEmail(email);
    }

    public List<User> allUser() {
        return userService.allUser();
    }
}
