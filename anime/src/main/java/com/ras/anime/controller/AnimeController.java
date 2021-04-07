package com.ras.anime.controller;

import com.ras.anime.model.Anime;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    @GetMapping(path = "list")
    public List<Anime> list() {
        return List.of(
                new Anime(1L, "Boku No Hero Academia", new BigDecimal("9.40")),
                new Anime(2L, "Shingeki no Kyojin", new BigDecimal("9.50")),
                new Anime(3L, "Naruto", new BigDecimal("10.00")),
                new Anime(4L, "Bleach", new BigDecimal("9.50")),
                new Anime(5L, "Katekyo Hitman Reborn", new BigDecimal("9.30")),
                new Anime(6L, "Shokugeki No Souma", new BigDecimal("8.50")),
                new Anime(7L, "One Punch Man", new BigDecimal("9.00")));
    }
}
