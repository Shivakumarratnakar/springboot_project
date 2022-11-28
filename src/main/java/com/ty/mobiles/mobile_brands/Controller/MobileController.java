package com.ty.mobiles.mobile_brands.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.mobiles.mobile_brands.Dao.MobileDao;
import com.ty.mobiles.mobile_brands.Dto.Mobile;

@RestController
public class MobileController {
@Autowired
MobileDao dao;
   
   @PostMapping("save")
   public Mobile saveMobile(@RequestBody Mobile mobile) {
	   return dao.saveMobile(mobile);
   }

   @GetMapping("get")
   
   public Mobile getByd(@RequestParam int id)
   {
	   return dao.getById(id);
   }

   
   @DeleteMapping("delete/{id}")
   public String deleteMobile(@PathVariable int id)
   {
	   return dao.delete(id);
   }
   
}
