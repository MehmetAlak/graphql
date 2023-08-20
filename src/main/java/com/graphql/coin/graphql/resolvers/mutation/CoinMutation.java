package com.graphql.coin.graphql.resolvers.mutation;

import com.graphql.coin.graphql.inputs.CoinInput;
import com.graphql.coin.model.entity.Coin;
import com.graphql.coin.service.ICoinService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CoinMutation implements GraphQLMutationResolver {
    private final ICoinService coinService;

    public Coin createCoin(CoinInput input) {
        return coinService.createCoin(input);
    }
}
