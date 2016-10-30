package com.airwxtx.recode.service.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.card.dao.CardDao;
import com.airwxtx.recode.dao.RecodeDao;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.recode.service.RecodeService;

@Service
public class RecodeServiceImpl implements RecodeService {

	@Autowired
	private RecodeDao recodeDao;
	
	@Autowired
	private CardDao cardDao;

	@Override
	@Transactional(readOnly = true)
	public List<Recode> findRecodeByCompanyOrNameWithPage(String company, String name, int page, int pageSize) {
		return recodeDao.findRecodeByCompanyOrNameWithPage(company, name, page, pageSize);
	}

	@Override
	@Transactional(readOnly = true)
	public int countUserWithCompanyOrName(String company, String name) {
		return recodeDao.countUserWithCompanyOrName(company, name);
	}

	@Override
	@Transactional(readOnly = true)
	public Recode loadRecode(Integer id) {
		Recode recode = recodeDao.loadRecode(id);
		Hibernate.initialize(recode.getClient());
		Hibernate.initialize(recode.getCard());
		Hibernate.initialize(recode.getUser());
		return recode;
	}

	@Override
	@Transactional
	public void deleteRecode(Integer recodeId) {
		Recode recode = recodeDao.loadRecode(recodeId);
		// 恢复对应会员卡的余额
		cardDao.addMoneyTo(recode.getConsumption(), recode.getCard());
		// 删除消费记录
		recodeDao.deleteRecode(recodeId);
	}

	public RecodeDao getRecodeDao() {
		return recodeDao;
	}

	public void setRecodeDao(RecodeDao recodeDao) {
		this.recodeDao = recodeDao;
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

}
