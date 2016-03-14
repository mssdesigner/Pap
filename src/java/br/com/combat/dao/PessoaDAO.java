package br.com.combat.dao;

import br.com.combat.entity.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Classe PessoaDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 14:01:38
 */
public class PessoaDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PapPU");
        return factory.createEntityManager();
    }


    public Pessoa salvar(Pessoa pessoa) {

        EntityManager entityManager = getEM();

        try {
            entityManager.getTransaction().begin();
            System.out.println("Salvando as informações do Aluno");
            if (pessoa.getId() == null) {
                entityManager.persist(pessoa);
            } else {
                pessoa = entityManager.merge(pessoa);
            }
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }

        return pessoa;
    }

    public void remover(Long id) {
        EntityManager em = getEM();
        Pessoa local = em.find(Pessoa.class, id);
        try {
            em.getTransaction().begin();
            em.remove(local);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Pessoa consultarPorId(Long id) {
        EntityManager em = getEM();
        Pessoa local = null;

        try {
            local = em.find(Pessoa.class, id); //Consultar por ID
        } finally {
            em.close();
        }
        return local;

    }
}
