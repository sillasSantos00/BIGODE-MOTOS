package br.com.motors.store.Stock.repository;

import br.com.motors.store.Stock.model.Itens_model;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Item_Repository extends JpaRepository<Itens_model, Long> {
    Boolean existsByShassi(String shassi);


}
