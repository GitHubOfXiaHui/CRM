package com.airwxtx.home.action.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.home.action.HomeAction;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("homeAction")
@Scope("prototype")
public class HomeActionImpl extends ActionSupport implements HomeAction {

}
