package com.ras.anime.service;

import com.ras.anime.model.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(
                new Anime(1L, "Boku No Hero Academia", new BigDecimal("9.40")),
                new Anime(2L, "Shingeki no Kyojin", new BigDecimal("9.50")),
                new Anime(3L, "Naruto", new BigDecimal("10.00")),
                new Anime(4L, "Bleach", new BigDecimal("9.50")),
                new Anime(5L, "Katekyo Hitman Reborn", new BigDecimal("9.30")),
                new Anime(6L, "Shokugeki No Souma", new BigDecimal("8.50")),
                new Anime(7L, "One Punch Man", new BigDecimal("9.00"))));
    }

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(Long id) {
        return animes
                .stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime Not Found"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(8, 100));
        animes.add(anime);
        return anime;
    }
}
