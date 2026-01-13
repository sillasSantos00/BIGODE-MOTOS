package br.com.motors.store.sellers.repository;

import br.com.motors.store.sellers.model.Sellers_model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Sellers_Repository extends JpaRepository<Sellers_model, Long> {
    Optional<Sellers_model> findByName(String name);
    Optional<Sellers_model> findByCpf(String cpf);

}

