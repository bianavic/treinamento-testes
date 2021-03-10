package br.com.concrete.treinamentotestes.case05.service;

import br.com.concrete.treinamentotestes.case05.model.User;
import br.com.concrete.treinamentotestes.case05.model.UserRequest;
import br.com.concrete.treinamentotestes.case05.model.UserResponse;
import br.com.concrete.treinamentotestes.case05.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public UserResponse saveNewUser(UserRequest userRequest) {

        User user = new User(
            UUID.randomUUID().toString(),
            userRequest.getEmail().trim().toLowerCase(),
            userRequest.getPassword()
        );

        userRepository.save(user);

        notificationService.sendNewUserSavedEvent(user);

        return new UserResponse(user.getId(), user.getPassword());
    }
}
