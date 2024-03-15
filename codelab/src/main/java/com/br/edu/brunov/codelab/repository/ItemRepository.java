package com.br.edu.brunov.codelab.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.edu.brunov.codelab.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}
