package com.airwxtx.client.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.client.action.ClientAction;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("clientAction")
//每个请求都会生成一个对象
@Scope("prototype")
public class ClientActionImpl extends ActionSupport implements ClientAction{
	private Client client;
	private List<Client> clients;
	private Integer clientId;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	@Autowired
	private ClientService clientService;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ClientService getClientService() {
		return clientService;
	}
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@Override
	public String preSaveClient() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}
	@Override
	public String saveClient() throws Exception {
		// TODO Auto-generated method stub
		if(this.clientService.saveClient(client))
			return SUCCESS;
		else
			return ERROR;
	}
	
	@Override
	public String updateClient() throws Exception {
		// TODO Auto-generated method stub
		this.clientService.updateClient(client);
		return null;
	}
	@Override
	public String deleteClient() throws Exception {
		// TODO Auto-generated method stub
		this.clientService.deleteClient(client);
		return null;
	}
	@Override
	public String searchClient() throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public String listAllClients() throws Exception {
		// TODO Auto-generated method stub
		clients = this.clientService.listAllClients();
		return ALLCLIENTS;
	}
	@Override
	public String showClientDetails() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		return DETAILS;
	}
	
	private static final String DETAILS = "details";
	private static final String ALLCLIENTS = "allClients";
}
