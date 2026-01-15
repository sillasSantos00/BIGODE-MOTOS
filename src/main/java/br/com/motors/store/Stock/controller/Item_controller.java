package br.com.motors.store.Stock.controller;

import br.com.motors.store.Stock.model.Itens_model;
import br.com.motors.store.Stock.service.Item_service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Itens")
public class Item_controller {

    private final Item_service itemService;

    public Item_controller(Item_service itemService) {
        this.itemService = itemService;
    }
    @GetMapping
    public List <Itens_model> getAll() {return itemService.getAll();}

     @PostMapping
  public Itens_model create (@RequestBody Itens_model itensModel) {return itemService.save(itensModel);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemns (@PathVariable Long id) {
        itemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
