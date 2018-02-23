package com.raphael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
