package WebServices.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebServices.Projeto.entities.OrderItem;
import WebServices.Projeto.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
