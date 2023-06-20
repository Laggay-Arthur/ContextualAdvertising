package com.contextadvertising.demo.Dao.Impl;
import com.contextadvertising.demo.Dao.UserDAO;
import com.contextadvertising.demo.HibernateSessionFactoryUtil;
import com.contextadvertising.demo.campaign.models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDataBaseDAO implements UserDAO {
    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    /*public List<CampaignPOJO> findAll() {
        List<CampaignPOJO> campaignPOJOS = (List<CampaignPOJO>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From CampaignPOJO ").list();
        return campaignPOJOS;
    }*/
}
