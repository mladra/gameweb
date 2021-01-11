package com.mladra.domain.common;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import com.mladra.domain.company.Company;
import com.mladra.domain.game.Game;
import com.mladra.domain.game.GameRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataGenerator {
    
    private final GameRepository gameRepository;

    @PostConstruct
    public void createData() {
        Long count = gameRepository.count();
        if (count == 0) {
            gameRepository.saveAll(createGames());
        }
    }

    private Collection<Game> createGames() {
        return IntStream.range(0, 10).mapToObj(num -> 
            Game.builder()
                .name(RandomStringUtils.randomAlphanumeric(16))
                .description(RandomStringUtils.randomAlphanumeric(128))
                .releaseDate(new Date())
                .author(Company.builder().name(RandomStringUtils.randomAlphanumeric(16)).build())
                .rating(RandomUtils.nextDouble(0, 5.01))
                .avgPrice(RandomUtils.nextDouble(0, 200.0))
                .build()).collect(Collectors.toList());
    }
}
