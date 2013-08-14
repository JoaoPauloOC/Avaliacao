/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.persistence.entity.Revendedor;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.model.ListDataModel;

/**
 *
 * @author João Paulo
 */
@ManagedBean
@ApplicationScoped
public class AplicacaoBean {

    private ArrayList<Revendedor> lista;
    private ListDataModel<Revendedor> revendedorDataModel;
    
    /**
     * Creates a new instance of CadastroBean
     */
    public AplicacaoBean() {
        lista = new ArrayList<Revendedor>();
        revendedorDataModel = new ListDataModel<>(lista);
    }
    
    public ListDataModel<Revendedor> getRevendedorDataModel() {
        return revendedorDataModel;
    }
    
    public void adicionar(Revendedor r){
        lista.add(r);
    }
    
}
