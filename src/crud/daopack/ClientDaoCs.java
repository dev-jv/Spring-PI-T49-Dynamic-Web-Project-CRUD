package crud.daopack;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crud.entity.Client;

@Repository
public class ClientDaoCs implements clientdao{

	@Override
	@Transactional
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		
		// get session
		
		Session mySession = sessionFactory.getCurrentSession();
		
		// Create consult
		
		Query<Client> myQuery = mySession.createQuery("from Client", Client.class);
		
		
		// run quey / return results
		
		
		List<Client> clients = myQuery.getResultList();
		
		
		return clients;
	}
	
	@Autowired
	private SessionFactory sessionFactory;
}



