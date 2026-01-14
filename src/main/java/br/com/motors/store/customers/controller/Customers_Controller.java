package br.com.motors.store.customers.controller;


import br.com.motors.store.customers.model.Customers_model;
import br.com.motors.store.customers.service.Customers_Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/customers")
public class Customers_Controller {

    private final Customers_Service customersService;

    public  Customers_Controller(Customers_Service customersService) {
        this.customersService = customersService;
    }
    @GetMapping //LISTA
    public List <Customers_model> getAll() {return  customersService.getAll();}

    @PostMapping //Rota para enviar
    public Customers_model create(@RequestBody Customers_model customersModel) {return customersService.save(customersModel);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customersService.delete(id);
        return ResponseEntity.noContent().build();
    }
 }
