package com.example.Learningdb;

public class CoursePojo {
	public Integer getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(Integer courseNo) {
		this.courseNo = courseNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	private  Integer courseNo;
	private  String name;
	private  Double price;
	private  String trainer;
	
	@Override
	public String toString() {
		return "CoursePojo [courseNo=" + courseNo + ", name=" + name + ", price=" + price + ", trainer=" + trainer
				+ "]";
	}
	

}
