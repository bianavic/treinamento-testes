package br.com.concrete.treinamentotestes.case04.service;

import br.com.concrete.treinamentotestes.case04.model.User;
import br.com.concrete.treinamentotestes.case04.model.UserRequest;
import br.com.concrete.treinamentotestes.case04.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    void test01() {

        UserRequest userRequest = new UserRequest("email1", "senha");

        User returnedDeletedUser = new User("ID", "email1", "SENHA", false);

        Mockito.when(userRepository.getUserByEmail("email1")).thenReturn(returnedDeletedUser);

        Assertions.assertFalse(userService.isExistingUser(userRequest));
    }
}