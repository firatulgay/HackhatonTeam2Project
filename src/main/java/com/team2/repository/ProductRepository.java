package com.team2.repository;

import com.team2.domain.Product;
import com.team2.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ozgeonec
 */
@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>  {

    List<Product> findByCategoryId (int id );
}
