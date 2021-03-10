package br.com.concrete.treinamentotestes.case02.component;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DateProvider {

    public LocalDate now() {
        return LocalDate.now();
    }
}
