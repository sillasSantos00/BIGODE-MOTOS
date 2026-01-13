package br.com.motors.store.sales_items.repository;

import br.com.motors.store.sales_items.model.Itens_model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Item_Repository extends JpaRepository<Itens_model, Long> {
    Optional<Itens_model> findByModelo(String modelo);


}
