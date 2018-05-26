package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.User;
@Repository

public interface UserRepository extends CrudRepository<User, Long>{

}
