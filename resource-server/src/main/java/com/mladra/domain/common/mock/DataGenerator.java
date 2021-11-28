package com.mladra.domain.common.mock;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("mock_data")
@Component
public class DataGenerator {

    @PostConstruct
    public void initializeData() {
        // TODO: mladra: Implement generating mock dat
    }
}
