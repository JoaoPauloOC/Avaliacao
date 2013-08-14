/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.convert;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author João Paulo
 */
@FacesConverter("CNPJConverter")
public class CNPJConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        String cnpj = string.replace("-", "");
        cnpj = cnpj.replace(".", "");
        cnpj = cnpj.replace("/", "");
        return string == null || string.trim().isEmpty() ? null : Long.valueOf(cnpj);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Long aux = (Long) o;
        String cnpj = aux + "";
        String parte1 = cnpj.substring(0, 2);
        String parte2 = cnpj.substring(2, 5);
        String parte3 = cnpj.substring(5, 8);
        String parte4 = cnpj.substring(8, 12);
        String parte5 = cnpj.substring(12);
        return parte1 + "." + parte2 + "." + parte3 + "/" + parte4 + "-" + parte5;
    }
    
    
    
}
