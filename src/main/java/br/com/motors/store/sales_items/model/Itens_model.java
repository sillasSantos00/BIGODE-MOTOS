package br.com.motors.store.sales_items.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens")

public class Itens_model {
    @Id
    @GeneratedValue

    private Long id;
    private String modelo;
    private String Ano_I_fa;
    private String marca;
    private String valor;



    public Itens_model(Long id, String modelo, String ano_I_fa, String marca, String valor) {
        this.id = id;
        this.modelo = modelo;
        this.Ano_I_fa = ano_I_fa;
        this.marca = marca;
        this.valor = valor;
    }

    public Itens_model() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno_I_fa() {
        return Ano_I_fa;
    }

    public void setAno_I_fa(String ano_I_fa) {
        Ano_I_fa = ano_I_fa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
