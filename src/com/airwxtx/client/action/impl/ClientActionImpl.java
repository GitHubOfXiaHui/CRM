package com.airwxtx.client.action.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.card.entity.Card;
import com.airwxtx.card.service.CardService;
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

	// 会员信息
	private Client client;
	// 会员卡信息
	private Card card;
	// 是否设为主卡
	private boolean mainCard;

	// 查询条件（姓名，单位，手机号，卡号）
	private String name;
	private String company;
	private String phone;
	private String cardNo;
	// 分页
	private int page;
	// 查询结果
	private List<Client> clients;

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CardService cardService;

	@Override
	public String preSaveClient() throws Exception {
		// TODO Auto-generated method stub
		return SAVE;
	}

	@Override
	public String saveClient() throws Exception {
		// TODO Auto-generated method stub
		removeNull(client.getFrequentFlyers());
		clientService.saveClient(client);
		return RESULT;
	}

	@Override
	public String preUpdateClient() throws Exception {
		// TODO Auto-generated method stub
		client = clientService.loadClient(client.getClientId());
		return UPDATE;
	}

	@Override
	public String updateClient() throws Exception {
		// TODO Auto-generated method stub
		removeNull(client.getFrequentFlyers());
		clientService.updateClient(client);
		return RESULT;
	}

	private void removeNull(List<String> list) {
		Predicate<String> pred1 = freq -> freq == null;
		Predicate<String> pred2 = freq -> freq.equals("");
		list.removeIf(pred1.or(pred2));
	}

	@Override
	public String showClientDetails() throws Exception {
		// TODO Auto-generated method stub
		client = clientService.loadClient(client.getClientId());
		return DETAILS;
	}

	@Override
	public String searchClient() throws Exception {
		// TODO Auto-generated method stub
		clients = this.clientService.searchClientByNameOrPhoneOrCompanyOrCardNoWithPage(name, phone, company, cardNo,
				page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = clientService.countClientByNameOrPhoneOrCompanyOrCardNo(name, phone, company, cardNo);
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
	
	@Override
	public String preAddCard() throws Exception {
		// TODO Auto-generated method stub
		return ADD;
	}

	@Override
	public String addCard() throws Exception {
		// TODO Auto-generated method stub
		cardService.createCard(card, client, mainCard);
		return CARD_DETAILS;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public boolean isMainCard() {
		return mainCard;
	}

	public void setMainCard(boolean mainCard) {
		this.mainCard = mainCard;
	}

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

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	private static final String DETAILS = "details";
	private static final String SAVE = "save";
	private static final String UPDATE = "update";
	private static final String RESULT = "result";
	private static final String LIST = "list";
	private static final String ADD = "add";
	private static final String CARD_DETAILS = "cardDetails";

}
