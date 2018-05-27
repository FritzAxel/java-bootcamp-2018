package repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{
	Item findByItemId(Long itemId);
}
