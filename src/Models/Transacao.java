package Models;

import java.time.LocalDate;

public class Transacao {

    private int id;
    private String tipo; //Receita ou despesa
    private double valor;
    private LocalDate data;
    private String categoria;
    private String descricao;

    public Transacao() {
    }

    public Transacao(int id, String tipo, double valor, LocalDate data, String categoria, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
