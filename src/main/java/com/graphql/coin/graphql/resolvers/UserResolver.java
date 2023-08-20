package com.graphql.coin.graphql.resolvers;

import com.graphql.coin.model.entity.Coin;
import com.graphql.coin.model.entity.User;
import com.graphql.coin.service.ICoinService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserResolver implements GraphQLResolver<User> {
    private final ICoinService coinService;

    public List<Coin> coins(User user) {
        return coinService.coinByUserId(user.getId());
    }

}
