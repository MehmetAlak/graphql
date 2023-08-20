package com.graphql.coin.graphql.inputs;

import lombok.Data;

@Data
public class CoinInput {
    private Long id;
    private String name;
    private Long userId;
    private UserInput user;
}
