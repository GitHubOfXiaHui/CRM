package com.airwxtx.card.action.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.card.action.CardAction;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.entity.CardStatus;
import com.airwxtx.card.service.CardService;
import com.airwxtx.client.service.ClientService;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("cardAction")
@Scope("prototype")
public class CardActionImpl extends ActionSupport implements CardAction {

	// 会员卡信息
	private Card card;
	// 充值金额
	private double money;

	// 扣款生成的消费记录
	private Recode recode;

	// 查询条件（卡号，卡状态）
	private String cardNo;
	private String status;
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
	public String cardDetails() throws Exception {
		// TODO Auto-generated method stub
		card = cardService.loadCard(card.getCardId());
		return DETAILS;
	}

	@Override
	public String freezeCard() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		if (cardService.canFreezeCard(username)) {
			cardService.freezeCard(card.getCardId(), username);
			jsonResult.put("resultInfo", "冻结成功");
		} else {
			jsonResult.put("resultInfo", "超过当日冻结次数");
		}
		return SUCCESS;
	}

	@Override
	public String unfreezeCard() throws Exception {
		// TODO Auto-generated method stub
		cardService.unfreezeCard(card.getCardId());
		jsonResult.put("resultInfo", "解冻成功");
		return SUCCESS;
	}

	@Override
	public String cardCharge() throws Exception {
		// TODO Auto-generated method stub
		cardService.charge(card.getCardId(), money);
		jsonResult.put("resultInfo", "充值成功");
		return SUCCESS;
	}

	@Override
	public String preCardPay() throws Exception {
		// TODO Auto-generated method stub
		card = cardService.loadCard(card.getCardId());
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
		cards = cardService.findCardByCardNoOrStatusWithPage(cardNo, status, page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = cardService.countCardWithCardNoOrStatus(cardNo, status);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	public List<String> getAllCardStautses() throws IllegalArgumentException, IllegalAccessException {
		List<String> cardStautses = new ArrayList<String>();
		Field[] fields = CardStatus.class.getFields();
		for (Field field : fields) {
			cardStautses.add((String) field.get(null));
		}
		return cardStautses;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	private static final String RECODE = "recode";

}
