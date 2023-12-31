package com.graphql.coin.graphql.resolvers.mutation;

import com.graphql.coin.graphql.inputs.UserInput;
import com.graphql.coin.model.entity.User;
import com.graphql.coin.service.IUserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMutation implements GraphQLMutationResolver {
    private final IUserService userService;

    public User createUser(UserInput input) {
        return userService.createUser(input);
    }
}
