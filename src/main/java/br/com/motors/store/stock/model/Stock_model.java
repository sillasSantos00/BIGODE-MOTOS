package br.com.motors.store.stock.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stock1")

public class Stock_model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String nome_prod;
    private Integer codigo_prod;
    private Integer quantidade_prod;

    public Stock_model() {
    }

    public Stock_model(Long product_id, String nome_prod, Integer quantidade_prod, Integer codigo_prod) {
        this.product_id = product_id;
        this.nome_prod = nome_prod;
        this.quantidade_prod = quantidade_prod;
        this.codigo_prod = codigo_prod;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public Integer getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(Integer codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public Integer getQuantidade_prod() {
        return quantidade_prod;
    }

    public void setQuantidade_prod(Integer quantidade_prod) {
        this.quantidade_prod = quantidade_prod;
    }
}
