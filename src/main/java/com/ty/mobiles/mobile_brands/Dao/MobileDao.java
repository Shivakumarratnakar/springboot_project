package com.ty.mobiles.mobile_brands.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.mobiles.mobile_brands.Dto.Mobile;
import com.ty.mobiles.mobile_brands.Repository.MobileRepo;

@Repository
public class MobileDao {

	@Autowired
	MobileRepo repo;
	public Mobile saveMobile(Mobile mobile)
	{
		return repo.save(mobile);
	}
	
	public Mobile getById(int id) {
		return repo.findById(id).get();
	}
	
	public String delete(int id) {
		repo.deleteById(id);
		return "deleted";
	}
	
}
