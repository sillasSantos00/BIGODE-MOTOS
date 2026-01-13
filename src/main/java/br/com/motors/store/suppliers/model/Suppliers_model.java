package br.com.motors.store.suppliers.model;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")

public class Suppliers_model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_fornecedor;
    private Integer cod_prod_estoque;
    private Integer quant_vendido;

    public Suppliers_model() {
    }

    public Suppliers_model(Long id, String nome_fornecedor, Integer cod_prod_estoque, Integer quant_vendido) {
        this.id = id;
        this.nome_fornecedor = nome_fornecedor;
        this.cod_prod_estoque = cod_prod_estoque;
        this.quant_vendido = quant_vendido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCod_prod_estoque() {
        return cod_prod_estoque;
    }

    public void setCod_prod_estoque(Integer cod_prod_estoque) {
        this.cod_prod_estoque = cod_prod_estoque;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public Integer getQuant_vendido() {
        return quant_vendido;
    }

    public void setQuant_vendido(Integer quant_vendido) {
        this.quant_vendido = quant_vendido;
    }
}
