package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.ShoppingCart;
@Repository

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
