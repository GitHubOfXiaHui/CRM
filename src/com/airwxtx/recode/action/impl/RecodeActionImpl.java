package com.airwxtx.recode.action.impl;

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
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("recodeAction")
@Scope("prototype")
public class RecodeActionImpl extends ActionSupport implements RecodeAction {

	private Integer recodeId;

	private Recode recode;

	private String company;

	private String name;

	private int page;

	private List<Recode> recodes;

	// 储存json结果
	private Map<String, Object> jsonResult = new HashMap<>();

	@Autowired
	private RecodeService recodeService;

	@Override
	public String detail() throws Exception {
		// TODO Auto-generated method stub
		recode = recodeService.loadRecode(recodeId);
		return DETAIL;
	}

	@Override
	public String delete() throws Exception {
		recodeService.deleteRecode(recodeId);
		jsonResult.put("resultInfo", "消费记录删除成功");
		return SUCCESS;
	}

	@Override
	public String exportRecode() throws Exception {
		String filename = "消费记录.xlsx";
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-disposition", "attachment;filename=" + new String(filename.getBytes("UTF-8"), "ISO-8859-1"));
		recodeService.exportXlsx(response.getOutputStream());
		return null;
	}

	@Override
	public String searchRecode() throws Exception {
		recodes = recodeService.findRecodeByCompanyOrNameWithPage(company, name, page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = recodeService.countUserWithCompanyOrName(company, name);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	public Integer getRecodeId() {
		return recodeId;
	}

	public void setRecodeId(Integer recodeId) {
		this.recodeId = recodeId;
	}

	public Recode getRecode() {
		return recode;
	}

	public void setRecode(Recode recode) {
		this.recode = recode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
