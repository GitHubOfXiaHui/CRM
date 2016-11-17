package com.airwxtx.recode.action.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.recode.action.RecodeAction;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.recode.service.RecodeService;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("recodeAction")
@Scope("prototype")
public class RecodeActionImpl extends ActionSupport implements RecodeAction {

	// ���Ѽ�¼
	private Recode recode;

	// ��ѯ����������ţ��г̣�
	private String fltNo;
	private String route;
	// ��ҳ
	private int page;
	// ��ѯ���
	private List<Recode> recodes;

	// ����json���
	private Map<String, Object> jsonResult = new HashMap<>();

	@Autowired
	private RecodeService recodeService;

	@Override
	public String detail() throws Exception {
		// TODO Auto-generated method stub
		recode = recodeService.loadRecode(recode.getRecodeId());
		return DETAIL;
	}

	@Override
	public String delete() throws Exception {
		String username = (String) ActionContext.getContext().getSession().get("user");
		if (recodeService.canDeleteRecode(recode, username)) {
			recodeService.deleteRecode(recode);
			jsonResult.put("resultInfo", "���Ѽ�¼ɾ���ɹ�");
		} else {
			jsonResult.put("resultInfo", "����10���ӣ��޷�ɾ�����Ѽ�¼");
		}

		return SUCCESS;
	}

	@Override
	public String exportRecode() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String filename = "���Ѽ�¼[" + sdf.format(new Date()) + "].xlsx";
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-disposition",
				"attachment;filename=" + new String(filename.getBytes("UTF-8"), "ISO-8859-1"));
		recodeService.exportXlsx(response.getOutputStream());
		return null;
	}

	@Override
	public String searchRecode() throws Exception {
		recodes = recodeService.findRecodeByFltNoOrRouteWithPage(fltNo, route, page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = recodeService.countRecodeWithFltNoOrRoute(fltNo, route);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	public Recode getRecode() {
		return recode;
	}

	public void setRecode(Recode recode) {
		this.recode = recode;
	}

	public String getFltNo() {
		return fltNo;
	}

	public void setFltNo(String fltNo) {
		this.fltNo = fltNo;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Recode> getRecodes() {
		return recodes;
	}

	public void setRecodes(List<Recode> recodes) {
		this.recodes = recodes;
	}

	public Map<String, Object> getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(Map<String, Object> jsonResult) {
		this.jsonResult = jsonResult;
	}

	public RecodeService getRecodeService() {
		return recodeService;
	}

	public void setRecodeService(RecodeService recodeService) {
		this.recodeService = recodeService;
	}

	private static final String LIST = "list";
	private static final String DETAIL = "detail";

}
