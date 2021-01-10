package com.mladra.domain.game;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("beforeCreateGameValidator")
public class BeforeCreateGameValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Game.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty");
    }
}
