package com.ras.anime.controller;

import com.ras.anime.model.Anime;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ras.anime.util.DateUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

// Define classe controller
// Define retorno dos métodos da classe como apenas strings (JSON)
@RestController
// Mapeando classe controller (localhost:8080/animes)
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;

    // Mapeando método list (localhost:8080/animes/list)
    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
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
