package br.com.motors.store.stock.repository;

import br.com.motors.store.stock.model.Stock_model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Stock_Repository extends JpaRepository<Stock_model, Long> {
  //  Optional<Stock_model> findByModelo();


}
