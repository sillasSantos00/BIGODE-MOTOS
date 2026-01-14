package br.com.motors.store.customers.repository;

import br.com.motors.store.customers.model.Customers_model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Customers_Repository extends JpaRepository<Customers_model, Long> {
    boolean existsByCpf(String cpf);

    boolean existsByTelefone(String telefone);

    boolean existsAllByEmail(String emeail);
}
