package br.com.combat.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;

/*
 * Classe TesteBean
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/03/2016 • 09:09:53
 */
@ManagedBean
public class TesteBean implements Serializable {

    public void teste() {
        
        System.out.println("OLA");
        RequestContext.getCurrentInstance().execute("teste();");
    }
}
