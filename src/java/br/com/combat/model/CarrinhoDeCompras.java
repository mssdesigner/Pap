package br.com.combat.model;


import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>() ;

    public void setItens(Item item) {
        this.itens.add(item);
    }
    

    public List<Item> getItens() {
        return itens;
    }

}
