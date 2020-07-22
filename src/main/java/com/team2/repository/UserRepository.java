package com.team2.repository;

import com.team2.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ozgeonec
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
