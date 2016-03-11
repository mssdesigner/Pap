package br.com.combat.model;


public class Produto {
    private long id;
        private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private double preco;
    private String marca;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", marca=" + marca + '}';
    }
    
}
