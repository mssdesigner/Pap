package br.com.combat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/*
 * Classe Pedido
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 11/03/2016 • 22:11:21
 */

@SequenceGenerator(name = "PED_SEQ", sequenceName = "PED_SEQ", initialValue = 1, allocationSize = 1)
@Entity
public class Pedido implements Serializable{
    
    private static final Long serialVersionUID = 2L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PED_SEQ")
    private Long id;
    private Date data_Hora;
    private int qtd_itens;
    private double valor;
    private String nf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_Hora() {
        return data_Hora;
    }

    public void setData_Hora(Date data_Hora) {
        this.data_Hora = data_Hora;
    }

    public int getQtd_itens() {
        return qtd_itens;
    }

    public void setQtd_itens(int qtd_itens) {
        this.qtd_itens = qtd_itens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }
    
    
    

}
