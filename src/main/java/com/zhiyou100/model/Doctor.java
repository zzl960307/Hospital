package com.zhiyou100.model;



public class Doctor {
	private int id;
	private String name;
	private int certificate_type;// 证件类型
	private String ID_num;
	private String phone;
	private String special_plane;
	private int sex;
	private int age;
	private String birther;
	private String email;
	private int section_id;
	private int education;
	private String noted;
	
	
	
	private Section section;
	
	private Certificate_type certificate;
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCertificate_type() {
		return certificate_type;
	}

	public void setCertificate_type(int certificate_type) {
		this.certificate_type = certificate_type;
	}

	public String getID_num() {
		return ID_num;
	}

	public void setID_num(String iD_num) {
		ID_num = iD_num;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecial_plane() {
		return special_plane;
	}

	public void setSpecial_plane(String special_plane) {
		this.special_plane = special_plane;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirther() {
		return birther;
	}

	public void setBirther(String birther) {
		this.birther = birther;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public String getNoted() {
		return noted;
	}

	public void setNoted(String noted) {
		this.noted = noted;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Certificate_type getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate_type certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", certificate_type=" + certificate_type + ", ID_num=" + ID_num
				+ ", phone=" + phone + ", special_plane=" + special_plane + ", sex=" + sex + ", age=" + age
				+ ", birther=" + birther + ", email=" + email + ", section_id=" + section_id + ", education="
				+ education + ", noted=" + noted + ", section=" + section + ", certificate=" + certificate + "]";
	}
	
}
