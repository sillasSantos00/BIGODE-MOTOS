package br.com.motors.store.Stock.service;

import br.com.motors.store.Stock.model.Itens_model;
import br.com.motors.store.Stock.repository.Item_Repository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class Item_service {
    private final Item_Repository itemRepository;

    public Item_service(Item_Repository itemRepository) {
        this.itemRepository = itemRepository;
    }
    //delete
    public void delete (Long id) {itemRepository.deleteById(id);}

    //lista

    public List<Itens_model> getAll() {return itemRepository.findAll();}

    public Itens_model save(Itens_model itensModel) {
        if (itemRepository.existsByShassi(itensModel.getShassi())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "shassi ja cadastrado");
        }
        return itemRepository.save(itensModel);
    }
}
