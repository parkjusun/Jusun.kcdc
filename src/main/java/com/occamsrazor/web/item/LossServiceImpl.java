package com.occamsrazor.web.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LossServiceImpl implements LossService{
	@Autowired LossDaoService itemDaoService;

	@Override
	public List<Loss> fideAll() {
		return itemDaoService.selectAll();
	}

}
