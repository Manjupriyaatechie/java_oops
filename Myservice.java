package com.example.Customerdb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class Myservice implements ServiceInterface {
	
	 @Autowired
	 public CustomerRepository repo;
    
  
	public String insertCustomer(CustomerPojo crs) {
		// TODO Auto-generated method stub
		
		Customer entity = new Customer();
		entity.setCourseNo(crs.getCourseNo());
		entity.setName(crs.getName());
		entity.setPrice(crs.getPrice());
		entity.setTrainer(crs.getTrainer());
		repo.save(entity);
		return "sucess";
	}

	
	@Override
	public String deleteCourse(int id) {
		
		Optional<Course>obj = repo.findById(id);
		if(obj.isEmpty())
		{
			throw new RuntimeException("course not found");
		}
		repo.delete(obj.get());
		return "Deleted Successfully";
	}

	
	public List<CoursePojo> getAll(){
	 List <Course> entityList = (List<Course>) repo.findAll();
	 List <CoursePojo> pojoList = new ArrayList();
	 for(Course entity : entityList)
	 {
		CoursePojo pojo = new CoursePojo();
		pojo.setCourseNo(entity.getCourseNo());
		pojo.setName(entity.getName());
		pojo.setPrice(entity.getPrice());
		pojo.setTrainer(entity.getTrainer());
		pojoList.add(pojo);
		
	 }
	 return pojoList;
    }

	@Override
	public String updatePrice(int id, Double newAmount) {
	    if (!repo.existsById(id))
        {
	    	throw new RuntimeException("course not found");
	    }
	    Optional<Course>obj = repo.findById(id);
	    Course course = obj.get();
	    course.setPrice(newAmount);
	    repo.save(course);
	    return "Updated Successfully";
	}
	    
}