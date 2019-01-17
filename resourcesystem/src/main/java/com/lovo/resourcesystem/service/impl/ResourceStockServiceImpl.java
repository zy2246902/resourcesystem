package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.ResourceStockDao;
import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.ResourceStockService;

@Service(value = "resourceStockService")
public class ResourceStockServiceImpl implements ResourceStockService {

	@Autowired
	private ResourceStockDao resourceStockDao;

	@Override
	public void resourceStockAdd(ResourceStockEntity resourceStock) {
		resourceStockDao.resourceStockAdd(resourceStock);
	}

	@Override
	public void resourceStockdelete(Integer id) {
		resourceStockDao.resourceStockDelete(id);

	}

	@Override
	public List<ResourceStockEntity> resourceStockFind() {

		return resourceStockDao.resourceStockFind();
	}

	@Override
	public List<ResourceStockEntity> resourceStockFind1(@Param("state") String state, Integer currentPage) {
		List<ResourceStockEntity> resourceStockList = resourceStockDao.resourceStockFind1(state, currentPage);
		return resourceStockList;
	}

	@Override
	public void resourceStockRevise(String state, Integer id) {
		resourceStockDao.resourceStockRevise(state, id);

	}

	@Override
	public int getTotalPageByItem(String state) {
		Integer totalCount = resourceStockDao.getTotalPageByItem(state);
		Integer totalPage = (totalCount + 4 - 1) / 4;
		return totalPage;
	}

}
