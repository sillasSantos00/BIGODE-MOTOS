package com.app.controller;


import com.app.model.Food;
import com.app.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/food")
public class foodcontroller {

    //injecao de dependecia

     private final FoodService foodService;

    public foodcontroller(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping //lista
    public List <Food> getAll() {return  foodService.getAll();}

    @PostMapping // rota para enviar
    public Food  create(@RequestBody Food food) {return foodService.save(food);}

    /*
    cabara que a mae trabalha ele e o porteiro , se cadastrar alimento  ele serve para cadastrar listar e deletar
     ele indica qual caminho vai ser percorrido
    */
// rotas para as regras de negocio e o controller
}
