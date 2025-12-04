package WebServices.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebServices.Projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
