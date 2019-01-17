package com.lovo.resourcesystem.text;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.service.CashStatementService;
/**
 * 业务层测试类
 * @author admin
 *
 */
public class CashStatementServiceImplText {
	ClassPathXmlApplicationContext app=null;
	@Before
	public void before(){

		app=new ClassPathXmlApplicationContext("jbdca.xml");	
	}
//	@Test
//	public void cashStatementAdd() {
//
//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
//		CashStatementEntity cashStatement = new CashStatementEntity();
//		cashStatement.setName("吴静");
//		cashStatement.setPhone("1234");
//		cashStatement.setState("在线");
//
//		cashStatementService.cashStatementAdd(cashStatement);
//
//	}
//	@Test
//	public void cashStatementdelete() {
//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
//		cashStatementService.cashStatementdelete(5);
//	}
	
//	@Test
//	public void cashStatementFinda() {
//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
//		List<CashStatementEntity> list =cashStatementService.cashStatementFinda();
//		for (CashStatementEntity cashStatementEntity : list) {
//			
//			System.out.println(cashStatementEntity);
//		}
//	}
	
	@Test
	public void cashStatementFindb(){
		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
		List<CashStatementEntity> list=cashStatementService.cashStatementFindb("出勤");
		for (CashStatementEntity cashStatementEntity : list) {
			System.out.println(cashStatementEntity);
		}
	}
	
	@Test
	public void cashStatementRevise() {
		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
		cashStatementService.cashStatementRevise(3,"出勤");
	}

}
