package com.br.edu.brunov.codelab.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.edu.brunov.codelab.domain.Categoria;


public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}
