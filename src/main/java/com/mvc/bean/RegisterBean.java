package com.mvc.bean;

public class RegisterBean {
private int LibId;
private int yearofadmin;
private String name,branch,section,semester;
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public int getLibId() {
	return LibId;
}
public void setLibId(int libId) {
	LibId = libId;
}
public int getYearofadmin() {
	return yearofadmin;
}
public void setYearofadmin(int yearofadmin) {
	this.yearofadmin = yearofadmin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
}
