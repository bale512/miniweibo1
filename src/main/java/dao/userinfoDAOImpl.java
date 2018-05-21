package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import pojo.Userinfo;

import java.util.List;

public class userinfoDAOImpl extends HibernateTemplate implements userinfoDAO {
    @Override
    public List<Userinfo> list() {
        return find("from Userinfo ");
    }

    @Override
    public void add(Userinfo userinfo) {
        save(userinfo);
    }

    @Override
    public void delete(Userinfo userinfo) {
        super.delete(userinfo);
    }

    @Override
    public void update(Userinfo userinfo) {
        super.update(userinfo);
    }

    @Override
    public Userinfo get(int id) {
        return (Userinfo)get(Userinfo.class,id);
    }
}
