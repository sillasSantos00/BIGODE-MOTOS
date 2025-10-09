package com.app.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // entidade no banco  cria uma tabela
@Table  // tabela no banco


public class Food {
    @Id // id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// faz o id ser sequencial 1 e depois vai ser o 1+1
    private Long id;
    private String name;
    private Integer quantity;
    private LocalDate expirationDate;

    public Food() {
    }

    public Food(Long id, Integer quantity, String name, LocalDate expirationDate) {
        this.quantity = quantity;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


// funciona como a mae , obejeto  e oque vamos trabalhar e o centro de tudo pode conter nome autrura , informacpes basicamas o modelo

}
