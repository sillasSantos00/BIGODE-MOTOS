package br.com.motors.store.customers.service;

import br.com.motors.store.customers.model.Customers_model;
import br.com.motors.store.customers.repository.Customers_Repository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Customers_Service {

    private final Customers_Repository customersRepository;

    public Customers_Service(Customers_Repository customersRepository) {this.customersRepository = customersRepository;}

    //listar
    public List<Customers_model> getAll() {return  customersRepository.findAll();
    }

    public Customers_model save(Customers_model customersModel) {
        if (customersRepository.existsByCpf(customersModel.getCpf())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "cpf ja cadastrado no sistema");
        }
        if (customersRepository.existsByTelefone(customersModel.getTelefone())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "telefone ja existe no banco ");
        }
        if (customersRepository.existsAllByEmail(customersModel.getEmail())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "email ja cadastrado no banco ");
        }


        return customersRepository.save(customersModel);
    }
}














































