/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.bean;

import combat.ejb.ClienteJuridicoRemoto;
import combat.ejb.ClienteRemoto;
import combat.ejb.TelefoneRemoto;
import combat.entidade.Cliente;
import combat.entidade.ClienteJuridico;
import combat.entidade.Telefone;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;

/**
 *
 * @author vinicius
 */
@ApplicationScoped
@ManagedBean
public class PessoaJuridicaBean {
    Cliente p = new Cliente();
    ClienteJuridico pj = new ClienteJuridico();
    Telefone tel = new Telefone();
    Telefone cel = new Telefone();




    @EJB
    private ClienteRemoto cr;
    @EJB
    private ClienteJuridicoRemoto cjr;
    @EJB
    private TelefoneRemoto tr;


    public void gravar() throws Exception {


        tel.setTipo("Tel");
        cel.setTipo("Tel");


        List<Telefone> telefones = new ArrayList();
        telefones.add(tel);
        telefones.add(cel);
        p.setTelefones(telefones);
        tel.setCliente(p);
        cel.setCliente(p);

        p = cr.salvar(p);

        pj.setPessoa(p);
        cjr.salvar(pj);



        RequestContext.getCurrentInstance().execute("teste();");

        p = new Cliente();
        pj = new ClienteJuridico();
        cel = new Telefone();
        tel = new Telefone();
    }

    public Cliente getP() {
        return p;
    }

    public void setP(Cliente p) {
        this.p = p;
    }

    public ClienteJuridico getPj() {
        return pj;
    }

    public void setPj(ClienteJuridico pj) {
        this.pj = pj;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }

    public Telefone getCel() {
        return cel;
    }

    public void setCel(Telefone cel) {
        this.cel = cel;
    }




}

