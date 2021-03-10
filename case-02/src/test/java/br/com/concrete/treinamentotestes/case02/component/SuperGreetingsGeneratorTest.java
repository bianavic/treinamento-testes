package br.com.concrete.treinamentotestes.case02.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperGreetingsGeneratorTest {

    @Test
    void test01() {
        SuperGreetingsGenerator superGreetingsGenerator = new SuperGreetingsGenerator(new DateProvider());

        String cenario1 = superGreetingsGenerator.sayHello("Fabi", 43);
        Assertions.assertEquals("Hello World, Fabi! 70's rocks!!!", cenario1);

        String cenario2 = superGreetingsGenerator.sayHello("Fabi", 32);
        Assertions.assertEquals("Hello World, Fabi! 80's rocks!!!", cenario2);

        String cenario3 = superGreetingsGenerator.sayHello("Fabi", 35);
        Assertions.assertEquals("Hello World, Fabi! 80's rocks!!!", cenario3);

        String cenario4 = superGreetingsGenerator.sayHello("Fabi", 15);
        Assertions.assertEquals("Hello World, Fabi! 00's rocks!!!", cenario4);
    }
}

// bug anos 2000
// eliminar soma (+1)
// LocalDate.now


