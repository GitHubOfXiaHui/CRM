package com.airwxtx.client.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.client.dao.ClientDao;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
import com.airwxtx.utils.ExportExcelUtil;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Transactional
	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		clientDao.saveClient(client);
	}

	@Transactional
	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		clientDao.updateClient(client);
	}

	@Transactional(readOnly = true)
	@Override
	public Client loadClient(Integer clientId) {
		// TODO Auto-generated method stub
		return clientDao.getClient(clientId);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Client> searchClientByNameOrPhoneOrCompanyOrCardNoWithPage(String name, String phone, String company,
			String card, int page, int pageSize) {
		// TODO Auto-generated method stub
		return clientDao.searchClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card, page, pageSize);
	}

	@Transactional(readOnly = true)
	@Override
	public int countClientByNameOrPhoneOrCompanyOrCardNo(String name, String phone, String company, String card) {
		// TODO Auto-generated method stub
		return clientDao.countClientByNameOrPhoneOrCompanyOrCardWithPage(name, phone, company, card);
	}

	@Transactional(readOnly = true)
	@Override
	public void exportXlsx(OutputStream out) throws IOException {
		// TODO Auto-generated method stub
		List<Client> clients = clientDao.loadAll();
		List<String[]> table = new ArrayList<>();
		table.add(new String[] { "��λ", "ְλ", "������", "Ӣ����", "�ֻ���", "���֤", "��ַ", "����", "������Ч��", "ͨ��֤", "ͨ��֤��Ч��", "�Ƽ��ͻ���Դ",
				"��λϲ��", "�ر�ϲ��", "���ÿ�" });
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		for (Client client : clients) {
			StringBuilder freqs = new StringBuilder();
			boolean first = true;
			for (String freq : client.getFrequentFlyers()) {
				if (!first) {
					freqs.append(", ");
				}
				freqs.append(freq);
				first = false;
			}
			table.add(new String[] { client.getCompany(), client.getTitle(), client.getClientName(),
					client.getClientEnglishName(), client.getMobilePhoneNumber(), client.getIdNumber(),
					client.getAddress(), client.getPassportNumber(), sdf.format(client.getPassportValidTime()),
					client.getAccessNumber(), sdf.format(client.getAccessValidTime()), client.getRecommend(),
					client.getPreferSeat(), client.getLike(), freqs.toString() });
		}
		ExportExcelUtil.xlsx(out, table);
	}

	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

}
