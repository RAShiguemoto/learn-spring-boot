package com.ras.anime.model;

import java.math.BigDecimal;

public class Anime {
    private Long id;
    private String name;
    private BigDecimal score;

    public Anime(Long id, String name, BigDecimal score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
