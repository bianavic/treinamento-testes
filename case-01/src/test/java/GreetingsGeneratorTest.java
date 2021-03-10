import br.com.concrete.treinamentotestes.case01.component.GreetingsGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsGeneratorTest {

    @Test
    void sayHello() {

        GreetingsGenerator greetingsGenerator = new GreetingsGenerator();

        String message = greetingsGenerator.sayHello("Fabi");

        Assertions.assertEquals("Hello World, Fabi!", message);
    }
}