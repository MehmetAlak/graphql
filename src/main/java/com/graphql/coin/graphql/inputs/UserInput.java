package com.graphql.coin.graphql.inputs;

import lombok.Data;

import java.util.List;

@Data
public class UserInput {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private List<CoinInput> coins;
}
