package br.com.concrete.treinamentotestes.case03.repository;

import br.com.concrete.treinamentotestes.case03.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    void save(User user);
}
