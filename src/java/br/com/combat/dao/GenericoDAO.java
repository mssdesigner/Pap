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
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Marcelo");
        return factory.createEntityManager();
    }

    public T salvar(T t) {

        EntityManager em = getEM();

        try {
            em.getTransaction().begin();

            if (t.getId() == null) {
                em.persist(t);
            } else {
                if (!em.contains(t)) {
                    if (em.find(t.getClass(), t.getId()) == null) {
                        throw new Exception("Erro ao atualizar");
                    }
                }
                t = em.merge(t);
            }
            em.getTransaction().commit();

        } catch (Exception ex) {
            em.getTransaction().rollback();
        } finally {
            em.close();
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

        return t = em.find(classe, id); //Consultar por ID

    }
}
