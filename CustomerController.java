package com.example.Customerdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
    
	@Autowired
	public Myservice service ;
	
   @RequestMapping("/welcome")	
   @ResponseBody
   public String welcome()
   {   System.out.println("Inside welcome method");
	   return "Hi All Welcome";
	   
   }
   
   @RequestMapping("/add")
   @ResponseBody
   public int addition(@RequestParam int a ,@RequestParam int b)
   { //  Myservice service = new Myservice();
	   return service.sum(a,b);
   }
   
   @RequestMapping("/prod")
   @ResponseBody
   public int multiply(@RequestParam int a ,@RequestParam int b)
   {  // Myservice service = new Myservice();
	   return service.mul(a,b);
   }
   
   @PostMapping("/insert")
   @ResponseBody
   public String courseInsert(@RequestBody CoursePojo crs) {
	   return service.insertCourse(crs);
   }
   
   @DeleteMapping("/deletecourse/{id}")
   @ResponseBody
   public String coursedelete(@PathVariable int id)
   {
	   return service.deleteCourse(id);
   }
   
   @GetMapping("/getAll")
   @ResponseBody
   public List<CoursePojo> allCourses()
   {
	 return service.getAll(); 
   }
   
   @PutMapping("updatecourse")
   @ResponseBody
   public String coursedelete(@RequestParam int id, Double amount )
   {
	   return service.updatePrice(id, amount);
   }
}
