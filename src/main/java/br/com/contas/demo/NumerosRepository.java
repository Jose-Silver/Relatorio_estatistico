package br.com.contas.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumerosRepository extends JpaRepository <numeros, Long>  {

}
