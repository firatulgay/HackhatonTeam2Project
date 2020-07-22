package com.team2.repository;

import com.team2.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ozgeonec
 */
@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>  {

}
