package br.com.combat.dao;

import br.com.combat.entity.PessoaFisica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Classe PessoaFisicaDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 12:38:11
 */
public class PessoaFisicaDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PapPU");
        EntityManager em = factory.createEntityManager();
        return em;
    }
    
    public PessoaFisica salvar(PessoaFisica pf) {

        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            em.persist(pf);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return pf;
    }
}
