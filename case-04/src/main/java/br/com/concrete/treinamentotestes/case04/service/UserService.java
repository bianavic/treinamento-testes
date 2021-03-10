package br.com.concrete.treinamentotestes.case04.service;

import br.com.concrete.treinamentotestes.case04.model.User;
import br.com.concrete.treinamentotestes.case04.model.UserRequest;
import br.com.concrete.treinamentotestes.case04.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isExistingUser(UserRequest userRequest) {

        User foundUser = userRepository.getUserByEmail(userRequest.getEmail());

        if (foundUser == null)
            return false;

        return !foundUser.isDeleted();
    }
}
