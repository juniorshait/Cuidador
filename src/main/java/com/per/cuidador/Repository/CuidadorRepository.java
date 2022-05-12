package com.per.cuidador.Repository;

import java.util.List;

import com.per.cuidador.Entity.Cuidador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long>{

    @Query(value = "SELECT * FROM `cuidador` WHERE `cpf` = :cpf", nativeQuery = true)
    List<Object> dadosCuidador(String cpf);
    
}
