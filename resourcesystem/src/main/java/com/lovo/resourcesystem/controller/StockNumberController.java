package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.service.StockNumberService;

@Controller
@RequestMapping("StockNumber")
public class StockNumberController {
	
	@Autowired
	private  StockNumberService stockNumberService;
	
	
	
	/**
	 *  展示所有资源
	 */
	@RequestMapping("/StockNumber.lovo")
	 @ResponseBody
	public List<StockNumberEntity> StockNumberFind() {
		
		List<StockNumberEntity> list = null;
	list=	stockNumberService.stockNumberFind();
		
		
		
		return list;
		
	}

}
