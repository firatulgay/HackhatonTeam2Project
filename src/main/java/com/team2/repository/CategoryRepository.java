package com.team2.repository;

import com.team2.domain.Category;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ozgeonec
 */
public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
