package br.com.concrete.treinamentotestes.case02.component;

import java.time.LocalDate;

public class SuperGreetingsGenerator {

    public String sayHello(String personName, int ageCompletedThisYear) {

        int currentYear = LocalDate.now().getYear();

        int decade = (currentYear - ageCompletedThisYear + 1 - ((currentYear - ageCompletedThisYear + 1) % 10)) % 100;

        return "Hello World, " + personName + "! " + decade + "'s rocks!!!";
    }
}
