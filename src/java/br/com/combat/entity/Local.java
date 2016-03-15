package br.com.combat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/*
 * Classe Local
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/03/2016 • 13:00:09
 */
@SequenceGenerator(name = "Local_Seq", sequenceName = "Local_Seq", initialValue = 1, allocationSize = 1)
@Entity
public class Local {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Local_Seq")
    @Id
    private Long id;
    private String predio;
    private String sala;
    private int capacidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Local{" + "id=" + id + ", predio=" + predio + ", sala=" + sala + ", capacidade=" + capacidade + '}';
    }
    
    

}
