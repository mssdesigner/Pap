package br.com.combat.bean;

import br.com.combat.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ProdutoBean {

    Produto produto = new Produto();
    List<Produto> produtos = new ArrayList<>();
    int totalDeProdutos = 0;

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public ProdutoBean() {
        Produto p = new Produto();
        p.setDescricao("Street fighter V");
        p.setMarca("Capcom");
        p.setPreco(180.0);

        p.setId(totalDeProdutos);

        this.produtos.add(p);
        totalDeProdutos++;

        p = new Produto();
        p.setDescricao("Fifa 2015");
        p.setMarca("EA Sports");
        p.setPreco(140.0);
        p.setId(totalDeProdutos);

        this.produtos.add(p);
        totalDeProdutos++;
        p = new Produto();
        p.setDescricao("Need for Speedy");
        p.setMarca("EA games");
        p.setPreco(180.0);
        p.setId(totalDeProdutos);
        this.produtos.add(p);
        totalDeProdutos++;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Produto procurarPorId(List<Produto> produtos, long id) {
        Produto p = new Produto();
        for (int i = 0; i < produtos.size(); i++) {
            if (id == produtos.get(i).getId()) {

                p = produtos.get(i);
            }
        }
        return p;
    }

    public void salvar() {
        totalDeProdutos++;
        this.produto.setId(totalDeProdutos);
        this.produtos.add(this.produto);
        this.produto = new Produto();
        System.out.println("Produto Salvo! Descricao:" + this.produto.getDescricao());
    }
}
