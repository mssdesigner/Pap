package br.com.combat.dao;

import br.com.combat.entity.Pessoa;
import br.com.combat.entity.PessoaFisica;

/*
 * Classe teste
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 13:46:38
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaFisicaDAO pfdao = new PessoaFisicaDAO();
        PessoaDAO pdao = new PessoaDAO();

        p.setRua("MSS");
        p.setBairro("MSS");
        p.setCep("MSS");
        p.setEmail("MSS");
        p.setEstado("MSS");
        p.setSenha("MSS");
        p.setNumero(12);

        pdao.salvar(p);
        System.out.println(p);
    }
}
