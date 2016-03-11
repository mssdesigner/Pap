package br.com.combat.bean;


import br.com.combat.bean.ProdutoBean;
import br.com.combat.model.CarrinhoDeCompras;
import br.com.combat.model.Item;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CarrinhoDeComprasBean {

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    Item item = new Item();
    private String mensagem;
    
    ProdutoBean pBean = new ProdutoBean();

    private double vTotal;

    public double getvTotal() {
        return vTotal;
    }

    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    

    public void gravar() {

        System.out.println("Funfa!!!");
        System.out.println("item:" + this.item.getProduto() + item.getQuantidade());
        System.out.println("id: " + this.id);
        this.item.setProduto(pBean.procurarPorId(pBean.produtos, id));
        this.carrinho.setItens(item);
        Total((item.getQuantidade() * item.getProduto().getPreco()));
        this.item = new Item();
        System.out.println("" + this.carrinho.getItens());
    }

    public void remover(Item item) {
        for (int i = 0; i < this.carrinho.getItens().size(); i++) {
            if (item.getProduto().getId() == this.carrinho.getItens().get(i).getProduto().getId() && item.getQuantidade()
                    == this.carrinho.getItens().get(i).getQuantidade()) {
                this.vTotal = this.vTotal - (this.carrinho.getItens().get(i).getQuantidade() * this.carrinho.getItens().get(i).getProduto().getPreco());
                this.carrinho.getItens().remove(i);
                mensagem="Removido com sucesso";
            }
        }
    }

    public void Total(double valor) {
        vTotal = vTotal + valor;

    }
    
    

}
