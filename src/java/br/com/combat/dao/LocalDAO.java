package br.com.combat.dao;

import br.com.combat.entity.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Classe LocalDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/03/2016 • 13:21:34
 */
public class LocalDAO {

    public EntityManager getEM() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Marcelo");

        return factory.createEntityManager();

    }

    public Local salvar(Local local) {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            em.persist(local);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return local;
    }
}
