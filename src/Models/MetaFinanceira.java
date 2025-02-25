package Models;

import java.time.LocalDate;

public class MetaFinanceira {

    private int id;
    private String descricao;
    private double valor;
    private LocalDate dataLimite;

    public MetaFinanceira() {
    }

    public MetaFinanceira(int id, String descricao, double valor, LocalDate dataLimite) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.dataLimite = dataLimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }
}
