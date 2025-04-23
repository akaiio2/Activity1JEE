package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//on a respecter le principe Couplage faible : On depend que des interfaces
//et non pas des classes (pas de new ).
//Classe implemente une interface

@Service("metier")

public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    //constructeur sans parametre pour faire l injection via le setter
    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double r = 275;
        return r;
    }

    public void setDao(DaoImpl dao) {
    }
}
