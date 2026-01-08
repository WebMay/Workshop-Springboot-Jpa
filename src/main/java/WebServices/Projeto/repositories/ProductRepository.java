package WebServices.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import WebServices.Projeto.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
