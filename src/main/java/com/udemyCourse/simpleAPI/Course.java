package com.udemyCourse.simpleAPI;

public class Course {
	
	private Long id;
	private String title;
	private String courseCode;
	
	
	public Course(Long id, String title, String courseCode) {
		super();
		this.id = id;
		this.title = title;
		this.courseCode = courseCode;
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getCourseCode() {
		return courseCode;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", courseCode=" + courseCode + "]";
	}

}
