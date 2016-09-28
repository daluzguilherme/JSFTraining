/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.support;
import br.com.model.dao.HibernateDAO;
import br.com.model.dao.InterfaceDAO;
import br.com.model.entities.TipoEndereco;
import br.com.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name="bbTipoEndereco")
@RequestScoped
public class BbTipoEndereco  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<TipoEndereco> getTipoEnderecos() {
        Session session = FacesContextUtil.getRequestSession();
        InterfaceDAO<TipoEndereco> tipoEnderecoDAO = new HibernateDAO<TipoEndereco>(TipoEndereco.class, session);
        return tipoEnderecoDAO.getEntities();
    }
}
