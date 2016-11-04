package com.airwxtx.card.action.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.card.action.CardAction;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.service.CardService;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("cardAction")
@Scope("prototype")
public class CardActionImpl extends ActionSupport implements CardAction {

	// 客户id
	private Integer clientId;
	private Client client;
	private Card card;

	// 卡id
	private Integer cardId;
	// 充值金额
	private double money;

	// 扣款生成的消费记录
	private Recode recode;

	// 查询条件（卡号、手机号）
	private String cardNo;
	private String phone;
	// 分页
	private int page;
	// 查询结果
	private List<Card> cards;

	private Map<String, Object> jsonResult = new HashMap<>();

	@Autowired
	private CardService cardService;
	@Autowired
	private ClientService clientService;

	@Override
	public String preSave() throws Exception {
		// TODO Auto-generated method stub
		client = clientService.getClient(clientId);
		return SAVE;
	}

	@Override
	public String saveCard() throws Exception {
		// TODO Auto-generated method stub
		client = clientService.getClient(clientId);
		card.setClient(client);
		this.cardService.saveCard(card);
		return DETAILS;
	}

	@Override
	public String preUpdate() throws Exception {
		// TODO Auto-generated method stub
		client = clientService.getClient(clientId);
		card = cardService.loadCard(cardId);
		return UPDATE;
	}

	@Override
	public String update() throws Exception {
		// TODO Auto-generated method stub
		this.cardService.updateCard(card);
		return DETAILS;
	}

	@Override
	public String loadCard() throws Exception {
		// TODO Auto-generated method stub
		card = cardService.loadCard(cardId);
		return DETAILS;
	}

	@Override
	public String freezeCard() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		if (cardService.canFreezeCard(username)) {
			cardService.freezeCard(cardId, username);
			jsonResult.put("resultInfo", "冻结成功");
		} else {
			jsonResult.put("resultInfo", "超过当日冻结次数");
		}
		return SUCCESS;
	}

	@Override
	public String unfreezeCard() throws Exception {
		// TODO Auto-generated method stub
		cardService.unfreezeCard(cardId);
		jsonResult.put("resultInfo", "解冻成功");
		return SUCCESS;
	}

	@Override
	public String cardCharge() throws Exception {
		// TODO Auto-generated method stub
		cardService.charge(cardId, money);
		jsonResult.put("resultInfo", "充值成功");
		return SUCCESS;
	}

	@Override
	public String preCardPay() throws Exception {
		// TODO Auto-generated method stub
		card = cardService.loadCard(cardId);
		return INPUT;
	}

	public void validateCardPay() throws Exception {
		if (recode.getConsumption() > card.getBalance()) {
			this.addFieldError("recode.consumption", "余额不足");
		}
	}

	@Override
	public String cardPay() throws Exception {
		// TODO Auto-generated method stub
		cardService.pay(card, recode);
		return RECODE;
	}

	@Override
	public String searchCard() throws Exception {
		// TODO Auto-generated method stub
		cards = cardService.findCardByCardNoOrPhoneWithPage(cardNo, phone, page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = cardService.countUserWithCardNoOrPhone(cardNo, phone);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Recode getRecode() {
		return recode;
	}

	public void setRecode(Recode recode) {
		this.recode = recode;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Map<String, Object> getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(Map<String, Object> jsonResult) {
		this.jsonResult = jsonResult;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	private static final String LIST = "list";
	private static final String DETAILS = "details";
	private static final String SAVE = "save";
	private static final String UPDATE = "update";
	private static final String RECODE = "recode";

}
