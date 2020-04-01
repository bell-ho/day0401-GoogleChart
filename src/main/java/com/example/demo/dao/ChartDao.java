package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ChartVo;

@Repository
public class ChartDao {
	public List<ChartVo>listAll(){
		return DBManager.listAll();
	}
}
