package br.com.combat.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;
import combat.ejb.ClienteFisicoRemoto;
import combat.ejb.ClienteRemoto;
import combat.entidade.Cliente;
import combat.entidade.ClienteFisico;
import combat.entidade.Telefone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * Classe PessoaFisicaBean
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 12/03/2016 • 12:39:45
 */
@ViewScoped
@ManagedBean
public class PessoaFisicaBean {

    Cliente p = new Cliente();
    ClienteFisico pf = new ClienteFisico();
    Telefone tel = new Telefone();
    Telefone cel = new Telefone();
    private String nasc;
    @EJB
    private ClienteRemoto cr;
    @EJB
    private ClienteFisicoRemoto cfr;

    public void gravar() throws Exception {
        
        System.out.println("Nome " + pf.getNome());
        if (pf.getNome() != null) {

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            tel.setTipo("Tel");
            cel.setTipo("Cel");
            List<Telefone> telefones = new ArrayList();
            telefones.add(tel);
            telefones.add(cel);
            p.setTelefones(telefones);
            tel.setCliente(p);
            cel.setCliente(p);
            p = cr.salvar(p);
            pf.setDataNasc(df.parse(nasc));

            pf.setPessoa(p);
            cfr.salvar(pf);

            RequestContext.getCurrentInstance().execute("teste();");

            p = new Cliente();
            pf = new ClienteFisico();
        } else {
            System.out.println("VAZIO");
        }
    }

    public Cliente getP() {
        return p;
    }

    public void setP(Cliente p) {
        this.p = p;
    }

    public ClienteFisico getPf() {
        return pf;
    }

    public void setPf(ClienteFisico pf) {
        this.pf = pf;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }

    public Telefone getCel() {
        return cel;
    }

    public void setCel(Telefone cel) {
        this.cel = cel;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

}
