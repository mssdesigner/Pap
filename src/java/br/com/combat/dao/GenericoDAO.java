package br.com.combat.dao;

import br.com.combat.entity.EntidadeBase;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Classe GenericoDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/03/2016 • 11:45:20
 */
public class GenericoDAO<T extends EntidadeBase> {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PapPU");
        return factory.createEntityManager();
    }

    public T salvar(T t) {

        EntityManager entityManager = getEM();

        try {
            entityManager.getTransaction().begin();
            System.out.println("Salvando as informações");
            if (t.getId() == null) {
                entityManager.persist(t);
            } else {
                t = entityManager.merge(t);
            }
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }

        return t;
    }

    public void remover(Class<T> classe, Long id) {
        EntityManager em = getEM();
        T t = em.find(classe, id);
        try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public T consultarPorId(Class<T> classe, Long id) {
        EntityManager em = getEM();
        T t = null;

        try {
            t = em.find(classe, id); //Consultar por ID
        } finally {
            em.close();
        }
        return t;

    }
}
