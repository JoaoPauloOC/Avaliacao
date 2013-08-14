/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.persistence.entity;

/**
 *
 * @author João Paulo
 */
public class Regiao {
    
    private String sigla;
    private String descricao;

    public Regiao(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
}
