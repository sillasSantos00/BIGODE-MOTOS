package com.app.service;

import com.app.model.Food;
import com.app.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    //listar
    public List<Food> getAll() {return foodRepository.findAll();}

    //criar
    public Food save(Food food) {return foodRepository.save(food);}

     //DELETAR
    public void delete(Long id){foodRepository.deleteById(id);}

    // acoes que podemos fazer com o model , pode ser funcao de dar folhes , quem for dar folher tem que achar a rota la do controller

    // regras de negocios sao aqui
}
