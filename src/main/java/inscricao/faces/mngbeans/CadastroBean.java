/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.persistence.entity.Estado;
import inscricao.persistence.entity.Regiao;
import inscricao.persistence.entity.Revendedor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import utfpr.faces.support.PageBean;

/**
 *
 * @author João Paulo
 */
@ManagedBean
@RequestScoped
public class CadastroBean extends PageBean {

    private Revendedor revendedor;
    
    private static final Regiao [] regioes = {
        new Regiao("S", "Sul"),
        new Regiao("SE", "Suldeste")
    };
    
    private static final Estado [] estados = {
        new Estado("PR", "Parana"),
        new Estado("SP", "Sao Paulo"),
        new Estado("RJ", "Rio de Janeiro"),
        new Estado("SC", "Santa Catarina"),
        new Estado("RS", "Rio Grande do Sul")
    };
    
    private List<SelectItem> regiaoItemList;
    private List<SelectItem> estadoItemList;
    
    /**
     * Creates a new instance of CadastroBean
     */
    public CadastroBean() {
        revendedor = new Revendedor();
    }

    public List<SelectItem> getRegiaoItemList() {
        if (regiaoItemList != null) return regiaoItemList;
        regiaoItemList = new ArrayList<>();
        for (Regiao r: regioes) {
            regiaoItemList.add(new SelectItem(r.getSigla(), r.getDescricao()));
        }
        return regiaoItemList;
    }
    
    public List<SelectItem> getEstadoItemList() {
        if (estadoItemList != null) return estadoItemList;
        estadoItemList = new ArrayList<>();
        for (Estado e: estados) {
            estadoItemList.add(new SelectItem(e.getSigla(), e.getDescricao()));
        }
        return estadoItemList;
    }
    
    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }
    
    public String cadastroAction(){
        AplicacaoBean apl = (AplicacaoBean) getBean("aplicacaoBean");
        apl.adicionar(revendedor);
        return "consulta";
    }
}
