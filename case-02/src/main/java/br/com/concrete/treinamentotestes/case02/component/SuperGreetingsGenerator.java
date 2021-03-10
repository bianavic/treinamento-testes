package br.com.concrete.treinamentotestes.case02.component;

import java.time.LocalDate;

public class SuperGreetingsGenerator {


    private DateProvider dateProvider;

    public SuperGreetingsGenerator(DateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    public String sayHello(String personName, int ageCompletedThisYear) {

        int currentYear = LocalDate.now().getYear();

        int decade = (currentYear - ageCompletedThisYear - ((currentYear - ageCompletedThisYear) % 10)) % 100;

        String template = "Hello World, %s! %02d's rocks!!!";

        return String.format(template, personName, decade);
        //return "Hello World, " + personName + "! " + decade + "'s rocks!!!";
    }

}
