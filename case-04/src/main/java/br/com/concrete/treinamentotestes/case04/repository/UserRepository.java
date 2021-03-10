package br.com.concrete.treinamentotestes.case04.repository;

import br.com.concrete.treinamentotestes.case04.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User getUserByEmail(String email);
}
