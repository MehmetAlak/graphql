package com.graphql.coin.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CoinId implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "user_id")
    private Long userId;
}
