package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ChartDao;
import com.example.demo.vo.ChartVo;
import com.example.demo.vo.EmpVo;
import com.google.gson.Gson;

@RestController
public class ChartController {
	@Autowired
	private ChartDao dao;
	
	
	
	public void setDao(ChartDao dao) {
		this.dao = dao;
	}



	@RequestMapping( value = "/list.do" , produces = "application/json;charset=UTF-8")
	public String chart() {
		String str = "";
		List<ChartVo>list = dao.listAll();
		Gson gson = new Gson();
		str=gson.toJson(list);
		return str;
	}
}
