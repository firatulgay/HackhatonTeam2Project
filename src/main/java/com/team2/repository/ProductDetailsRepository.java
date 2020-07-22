package com.team2.repository;

import com.team2.domain.ProductDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ozgeonec
 */
@Repository
public interface ProductDetailsRepository extends CrudRepository<ProductDetails,Integer> {

    ProductDetails findByProductId(int id);
}
