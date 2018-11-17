package com.bid.springcloud.serviceImpl;



import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
	
	 public boolean add(Dept dept);
	 
	  public Dept    get(Long id);
	  
	  public List<Dept> list();

	  public CoUser demo(Integer i);


	

}
