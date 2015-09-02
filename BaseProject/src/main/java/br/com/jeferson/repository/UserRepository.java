package br.com.jeferson.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.jeferson.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
