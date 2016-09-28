package br.com.support;
import br.com.model.dao.HibernateDAO;
import br.com.model.dao.InterfaceDAO;
import br.com.model.entities.Estado;
import br.com.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bbEstado")
@RequestScoped
public class BbEstado  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<Estado> getEstados() {
        InterfaceDAO<Estado> estadoDAO = new HibernateDAO<Estado>(Estado.class, FacesContextUtil.getRequestSession());
        return estadoDAO.getEntities();
    }	
}