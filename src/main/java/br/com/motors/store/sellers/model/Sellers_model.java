package br.com.motors.store.sellers.model;

import jakarta.persistence.*;

@Entity // entidade no banco  cria uma tabela
@Table(name = "sellers") // tabela no banco

public class Sellers_model {
    @Id // id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// faz o id ser sequencial 1 e depois vai ser o 1+1
    private Long id;
    private String name;
    private String cpf;
    private String codigo_vendedor;
    private String email;

    public Sellers_model() {
    }

    public Sellers_model(Long id, String name, String cpf, String codigo_vendedor, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.codigo_vendedor = codigo_vendedor;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(String codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}