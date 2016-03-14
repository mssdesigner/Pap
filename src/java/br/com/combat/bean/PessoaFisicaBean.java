package br.com.combat.bean;

import br.com.combat.dao.PessoaDAO;
import br.com.combat.dao.PessoaFisicaDAO;
import br.com.combat.entity.Pessoa;
import br.com.combat.entity.PessoaFisica;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Classe PessoaFisicaBean
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 12:39:45
 */
@ApplicationScoped
@ManagedBean
public class PessoaFisicaBean {
    Pessoa p = new Pessoa();
    PessoaFisica pf = new PessoaFisica();
    PessoaFisicaDAO pfdao = new PessoaFisicaDAO();
    PessoaDAO pdao = new PessoaDAO();
    
    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Pap_TestandoPU");
        EntityManager em = factory.createEntityManager();
        return em;
    }

    public void gravar() {
        System.out.println("PASSAMOS AQUI");
        EntityManager em =getEM();
        System.out.println("P: " +p.getBairro() + p.getCep() + p.getCidade());
        em.getTransaction().begin();
        em.persist(p);
        System.out.println("PF: " + pf.getNome() + pf.getCpf() + pf.getDataNasc());
        pf.setPessoa(p);
        em.persist(pf);
        em.getTransaction().commit();
        em.close();
 
        p = new Pessoa();
        pf = new PessoaFisica();
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    public PessoaFisicaDAO getPfdao() {
        return pfdao;
    }

    public void setPfdao(PessoaFisicaDAO pfdao) {
        this.pfdao = pfdao;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public PessoaDAO getPdao() {
        return pdao;
    }

    public void setPdao(PessoaDAO pdao) {
        this.pdao = pdao;
    }
    
    

}
