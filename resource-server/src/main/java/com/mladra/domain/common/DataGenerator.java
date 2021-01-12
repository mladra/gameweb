package com.mladra.domain.common;

import com.mladra.domain.company.Company;
import com.mladra.domain.company.CompanyRepository;
import com.mladra.domain.game.Game;
import com.mladra.domain.game.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class DataGenerator {

    private final CompanyRepository companyRepository;
    private final GameRepository gameRepository;

    @PostConstruct
    public void createData() {
        Company company = Company.builder().name("CD Projekt Red").build();
        companyRepository.save(company);

        Game game = Game.builder().name("The Witcher 3: The Wild Hunt").author(company).releaseDate(new Date())
                .rating(5.0).avgPrice(130.0).build();
        company.setGames(Arrays.asList(game));
        gameRepository.save(game);
    }
}
