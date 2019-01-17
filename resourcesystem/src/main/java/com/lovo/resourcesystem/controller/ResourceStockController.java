package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.ResourceStockService;

@Controller
public class ResourceStockController {
	
	@Autowired
	private ResourceStockService resourceStock;
	
	@RequestMapping("show.lovo")
	public ModelAndView show() {
		ModelAndView mv=new ModelAndView("carManagement");
		List<ResourceStockEntity> resourceStockList = resourceStock.resourceStockFind();
		mv.addObject("resourceStockList", resourceStockList);
		return mv;		
	}
}
