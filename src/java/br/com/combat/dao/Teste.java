package br.com.combat.dao;

import br.com.combat.entity.Local;

/*
 * Classe teste
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 13:46:38
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        Local local = new Local();
        LocalDAO dao = new LocalDAO();

        local.setId(1l);
        local.setSala("MSS");
        local.setPredio("MSS");
        local.setCapacidade(4);

        dao.salvar(local);
        System.out.println(local);
    }
}
