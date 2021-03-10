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

    @InjectMocks // classe para testar
    private UserService userService;

    @Mock // dependencias que iremos usar
    private UserRepository userRepository;

    @Test
    void aoVerificarSeusuarioExisteQuandoNaoTemUsuarioComMesmoEmailInformadoNoBancoDeveRetornarNull() {

        // injetar o comportamento
        Mockito.when(userRepository.getUserByEmail("email1")).thenReturn(null);

        UserRequest userRequest = new UserRequest("email1", "senha");

        Assertions.assertFalse(userService.isExistingUser(userRequest));
    }

    @Test
    void aoVerificarSeusuarioExisteQuandoNaoTemUsuarioComMesmoEmailInformadoNoBancoDeveRetornarFalse() {

        User user = new User("1", "email1", "senha1", false);

        // injetar o comportamento
        Mockito.when(userRepository.getUserByEmail("email1")).thenReturn(user);

        UserRequest userRequest = new UserRequest("email1", "senha");

        Assertions.assertTrue(userService.isExistingUser(userRequest));
    }
}