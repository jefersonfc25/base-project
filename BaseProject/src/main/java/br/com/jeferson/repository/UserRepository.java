package br.com.jeferson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.jeferson.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
