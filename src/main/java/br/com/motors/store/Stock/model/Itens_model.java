package br.com.motors.store.Stock.model;

import jakarta.persistence.*;

@Entity
@Table(name = "itens")

public class Itens_model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String Ano_fa;
    private String marca;
    private String valor;
    private String chassi;




    public Itens_model(Long id, String modelo, String ano_I_fa, String marca, String valor, String shassi) {
        this.id = id;
        this.modelo = modelo;
        this.Ano_fa = ano_I_fa;
        this.marca = marca;
        this.valor = valor;
        this.chassi = shassi;
    }

    public Itens_model(String shassi) {

        this.chassi = shassi;
    }

    public String getShassi() {
        return chassi;
    }

    public void setShassi(String shassi) {
        this.chassi = shassi;
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

    public String getAno_fa() {
        return Ano_fa;
    }

    public void setAno_fa(String ano_fa) {
        Ano_fa = ano_fa;
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
