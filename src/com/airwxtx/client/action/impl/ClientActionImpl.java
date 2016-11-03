package com.airwxtx.client.action.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.client.action.ClientAction;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("clientAction")
// 每个请求都会生成一个对象
@Scope("prototype")
public class ClientActionImpl extends ActionSupport implements ClientAction {
	private Client client;
	private List<Client> clients;
	private Integer clientId;
	private Integer page;
	private String name;
	private String company;
	private String phone;
	private String card;
	@Autowired
	private ClientService clientService;

	@Override
	public String preSaveClient() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}

	@Override
	public String saveClient() throws Exception {
		// TODO Auto-generated method stub
		this.clientService.saveClient(client);
		return DETAILS;
	}

	@Override
	public String preUpdateClient() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		return UPDATE;
	}

	@Override
	public String updateClient() throws Exception {
		// TODO Auto-generated method stub
		this.clientService.updateClient(client);
		return DETAILS;
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
		clients = this.clientService.searchClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card, page,
				Constants.PAGE_SIZE);
		return LIST;
	}

	@Override
	public String showClientDetails() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		return DETAILS;
	}

	public int getMaxPage() {
		int count = clientService.countClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	@Override
	public void exportClient() throws Exception {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String filename = "会员列表[" + sdf.format(now) + "].xlsx";
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-disposition",
				"attachment;filename=" + new String(filename.getBytes("UTF-8"), "ISO-8859-1"));
		clientService.exportXlsx(response.getOutputStream());
	}

	// =========================================================================================================
	// set and get
	// =========================================================================================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

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

	private static final String DETAILS = "details";
	private static final String UPDATE = "update";
	private static final String LIST = "list";

}
