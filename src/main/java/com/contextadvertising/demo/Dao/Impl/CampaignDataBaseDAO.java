package com.contextadvertising.demo.Dao.Impl;
import com.contextadvertising.demo.Dao.CampaignDAO;
import com.contextadvertising.demo.Dao.DaoBase;
import com.contextadvertising.demo.HibernateSessionFactoryUtil;
import com.contextadvertising.demo.campaign.models.CampaignPOJO;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CampaignDataBaseDAO implements CampaignDAO {

    @Override
    public CampaignPOJO findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(CampaignPOJO.class, id);
    }

    @Override
    public void save(CampaignPOJO campaignPOJO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(campaignPOJO);
        tx1.commit();
        session.close();
    }
    @Override
    public void update(CampaignPOJO campaignPOJO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(campaignPOJO);
        tx1.commit();
        session.close();
    }
    @Override
    public void delete(CampaignPOJO campaignPOJO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(campaignPOJO);
        tx1.commit();
        session.close();
    }

    /*public List<CampaignPOJO> findAll() {
        List<CampaignPOJO> campaignPOJOS = (List<CampaignPOJO>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From CampaignPOJO ").list();
        return campaignPOJOS;
    }*/
}
