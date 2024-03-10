package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    private IDao dao = null;
    public MetierImpl(IDao dao)
    {
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        return tmp;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
