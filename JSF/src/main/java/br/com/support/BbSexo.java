package br.com.support;

import br.com.model.dao.HibernateDAO;
import br.com.model.dao.InterfaceDAO;
import br.com.model.entities.Sexo;
import br.com.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author guilherme
 */
@ManagedBean(name="bbsexo")
@RequestScoped
public class BbSexo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public List<Sexo> getSexos(){
        InterfaceDAO<Sexo> sexoDAO = new HibernateDAO<Sexo>(Sexo.class, 
                FacesContextUtil.getRequestSession());
        return sexoDAO.getEntities();
    }
}
