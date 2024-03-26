package com.example.Learningdb;

import java.util.List;

public interface ServiceInterface {
	public int sum(int i, int j);
	public int mul(int a, int b);
	public String insertCourse(CoursePojo crs);
	public String deleteCourse(int id);
	public List<CoursePojo> getAll();
	//this method is used to update the amount for the given course ID
	public String updatePrice(int id, Double newAmount);
}
