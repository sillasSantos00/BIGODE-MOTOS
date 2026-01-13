package com.app.repository;

import com.app.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository  extends JpaRepository <Food, Long> {
    //e o contador que serve pra saber  qunatas  pessoas entraram no quarto pra comer sua mae , coneta ao banco de dados
    //
}
