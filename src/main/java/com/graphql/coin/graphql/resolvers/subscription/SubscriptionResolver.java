package com.graphql.coin.graphql.resolvers.subscription;

import com.graphql.coin.model.dto.CoinPrice;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

@Component
public class SubscriptionResolver implements GraphQLSubscriptionResolver {

    public Publisher<CoinPrice> coinPrice(String name) {
        Random random = new Random();
        return Flux.interval(Duration.ofSeconds(1))
                .map(num -> new CoinPrice(name, random.nextDouble(), LocalDate.now()));
    }
}
