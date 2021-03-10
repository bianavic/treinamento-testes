package br.com.concrete.treinamentotestes.case03.service;

import br.com.concrete.treinamentotestes.case03.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    String firstName = "Fabi";
    String lastName = "Ferlin";

    @Test
    void formattedFullNameFrom() {

        UserRepository userRepositoryMock = Mockito.mock(UserRepository.class);

        Assertions.assertEquals("FabiFerlin", firstName+lastName);

                //(user.getFirstName() + " " + user.getLastName()).toUpperCase().trim();

    }
}