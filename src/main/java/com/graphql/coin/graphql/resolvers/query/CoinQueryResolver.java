package com.graphql.coin.graphql.resolvers.query;

import com.graphql.coin.model.entity.Coin;
import com.graphql.coin.service.ICoinService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CoinQueryResolver implements GraphQLQueryResolver {
    private final ICoinService coinService;

    public Coin coinByName(String name) {
        return coinService.coinByName(name);
    }

    public List<Coin> allCoins() {
        return coinService.allCoins();
    }
}
