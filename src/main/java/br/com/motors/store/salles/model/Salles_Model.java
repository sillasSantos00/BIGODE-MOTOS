package br.com.motors.store.salles.model;


import jakarta.persistence.*;

@Entity
@Table(name = "salles")
public class Salles_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String na;


   // codigo ven  client  do produt
}
