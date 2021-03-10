package br.com.concrete.treinamentotestes.case03.service;

import br.com.concrete.treinamentotestes.case03.model.User;
import br.com.concrete.treinamentotestes.case03.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String formattedFullNameFrom(User user) {

        return (user.getFirstName() + " " + user.getLastName());
    }

    public void saveUser(User user) {

        userRepository.save(user);
    }
}
