package com.graphql.coin.service;

import com.graphql.coin.graphql.inputs.CoinInput;
import com.graphql.coin.model.entity.Coin;

import java.util.List;
import java.util.Set;

public interface ICoinService {

    List<Coin> coinByUserId(Long id);

    List<Coin> findByUserIdIn(Set<Long> id);

    List<Coin> allCoins();

    Coin createCoin(CoinInput input);

    Coin coinByName(String name);
}
