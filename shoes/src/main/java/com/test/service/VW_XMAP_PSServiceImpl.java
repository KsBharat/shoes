package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.Vw_Dao;
import com.test.model.VW_XMAP_PS;
@Service
public class VW_XMAP_PSServiceImpl implements VW_XMAP_PSService {
	
	@Autowired
	public Vw_Dao ps;

	public List<VW_XMAP_PS> view() {
		// TODO Auto-generated method stub
		return ps.view();
	}

	public List<VW_XMAP_PS> getbestpriceproducts() {
		// TODO Auto-generated method stub
		return ps.getbestpriceproduct();
	}

}
