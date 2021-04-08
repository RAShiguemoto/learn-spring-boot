package com.ras.anime.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;
    private BigDecimal score;
}
