package com.dio.desafiopadroes.labpadroesprojetospring.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteREpository extends CrudRepository <Cliente, Long>{
}
