package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.service.CashStatementService;
/**
 * 医生管理
 * @author admin
 *
 */
@Controller
@RequestMapping("CashStatement")
public class CashStatementController {

	@Autowired
	private CashStatementService cashStatementService;
	
	/**
	 * 展示医生
	 * @return
	 */
	 @RequestMapping("/CashStatement.lovo")
	 @ResponseBody
	public List<CashStatementEntity> cashStatementFinda(){
		 List<CashStatementEntity> list = null;
		 
		list = cashStatementService.cashStatementFinda();
		 
		 
		 return list;
		 
	 }
}
