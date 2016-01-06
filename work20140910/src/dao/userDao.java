package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class userDao {

	SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public Session getHibernateTemplate(){
		
		return sf.getCurrentSession();
	}
}
