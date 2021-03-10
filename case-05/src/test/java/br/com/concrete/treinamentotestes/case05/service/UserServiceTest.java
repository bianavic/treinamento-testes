package br.com.concrete.treinamentotestes.case05.service;

import br.com.concrete.treinamentotestes.case05.model.UserRequest;
import br.com.concrete.treinamentotestes.case05.model.UserResponse;
import br.com.concrete.treinamentotestes.case05.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private NotificationService notificationService;

    @Test
    void savingNewUserSuccess() {

        UserRequest userRequest = new UserRequest("email1", "senha1");

        UserResponse savedUser = userService.saveNewUser(userRequest);

        assertNotNull(savedUser);
    }
}