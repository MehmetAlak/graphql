package com.graphql.coin.repository;

import com.graphql.coin.model.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
    List<Coin> findByUser_Id(Long id);

    List<Coin> findByUser_IdIn(Set<Long> ids);

    Coin findByIdName(String name);
}
