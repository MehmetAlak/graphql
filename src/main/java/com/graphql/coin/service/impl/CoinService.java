package com.graphql.coin.service.impl;

import com.graphql.coin.graphql.inputs.CoinInput;
import com.graphql.coin.model.entity.Coin;
import com.graphql.coin.model.entity.CoinId;
import com.graphql.coin.repository.CoinRepository;
import com.graphql.coin.service.ICoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CoinService implements ICoinService {
    private final CoinRepository coinRepository;

    @Override
    public List<Coin> coinByUserId(Long id) {
        log.info("{} nolu kullanıcı için veritabanından coinleri getirildi", id);
        return coinRepository.findByUser_Id(id);
    }

    @Override
    public List<Coin> findByUserIdIn(Set<Long> ids) {
        log.info("Tüm Kullanıcıların coinleri tek seferde getirildi.");
        return coinRepository.findByUser_IdIn(ids);
    }

    @Override
    public List<Coin> allCoins() {
        return coinRepository.findAll();
    }

    @Override
    public Coin createCoin(CoinInput input) {
        CoinId coinId = CoinId.builder()
                .name(input.getName())
                .userId(input.getUserId())
                .build();
        Coin coin = Coin.builder()
                .id(coinId)
                .build();
        return coinRepository.save(coin);
    }

    @Override
    public Coin coinByName(String name) {
        return coinRepository.findByIdName(name);
    }
}
