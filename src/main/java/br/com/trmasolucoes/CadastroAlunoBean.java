package br.com.trmasolucoes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tairo on 18/04/15.
 */
@ManagedBean
@ViewScoped
public class CadastroAlunoBean implements Serializable{
    private String nome;
    private String email;
    private Date dataNascimento;

    public void cadastrar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("E-mail: "+this.email);
        System.out.println("Data de nascimento: "+this.dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
