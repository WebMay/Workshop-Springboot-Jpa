package WebServices.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebServices.Projeto.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
