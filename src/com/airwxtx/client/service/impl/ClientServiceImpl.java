package com.airwxtx.client.service.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.client.dao.ClientDao;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClientDao clientDao;
	


	//一个只读事务，可以提高效率。
	@Transactional
	@Override
	public boolean saveClient(Client client) {
		// TODO Auto-generated method stub
		if(this.clientDao.saveClient(client) == null)
			return false;
		else
			return true;
	}

	@Transactional
	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		this.clientDao.updateClient(client);
	}

	@Transactional
	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub
		this.clientDao.deleteClient(client);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Client getClient(Integer clientId) {
		// TODO Auto-generated method stub
		//默认不加载集合属性，强制加载集合属性。
		Client cl = this.clientDao.getClient(clientId);
		Hibernate.initialize(cl.getFrequentFlyers());
		return cl;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Client> searchClientByNameOrPhoneOrCompanyOrCardWithPage(String name, String phone, String company,
			String card, int page, int pageSize) {
		// TODO Auto-generated method stub
		return this.clientDao.searchClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card, page, pageSize);
	}

	@Transactional(readOnly = true)
	@Override
	public int countClientByNameOrPhoneOrCompanyOrCardWithPage(String name, String phone, String company, String card) {
		// TODO Auto-generated method stub
		return this.clientDao.countClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card);
	}
	
	
	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
}
