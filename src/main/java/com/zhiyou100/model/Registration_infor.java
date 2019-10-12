package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Registration_infor {
	/*`medical_record` varchar(100) DEFAULT NULL COMMENT '病例号',
	  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
	  `certificate_type` varchar(100) DEFAULT NULL COMMENT '证件类型',
	  `ID_num` varchar(100) DEFAULT NULL COMMENT '证件号',
	  `social_safe_num` varchar(30) DEFAULT NULL COMMENT '社保号',
	  `phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
	  `self_paying` int(11) DEFAULT NULL COMMENT '是否自费',
	  `sex` int(11) DEFAULT NULL COMMENT '性别',
	  `career` varchar(200) DEFAULT NULL COMMENT '职业',
	  `early_appointment` varchar(30) DEFAULT NULL COMMENT '初复诊',
	  `doctor_id` int(11) DEFAULT NULL COMMENT '医生表主键',
	  `status` varchar(11) DEFAULT NULL COMMENT '状态',
	  `noted` varchar(500) DEFAULT NULL COMMENT '备注',
	  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	  `section_id` int(11) DEFAULT NULL,
	  `age` int(11) DEFAULT NULL COMMENT '年龄',
	  `registration_fee` double DEFAULT NULL COMMENT '挂号费',*/
	
	private String medical_record;
	private	String name;
	private String certificate_type;
	private	String ID_num;
	private	String social_safe_num;
	private	String phone;
	private	int self_paying; 
	private	int sex; 
	private	String career;
	private	String early_appointment;
	private int doctor_id;
	private String status;
	private String noted;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private	Date time;
	private int section_id;
	private int age;
	private double registration_fee;
	
	
	private Doctor doctor;
	private Certificate_type certificate;
	private Section section;
	
	
	public String getMedical_record() {
		return medical_record;
	}
	public void setMedical_record(String medical_record) {
		this.medical_record = medical_record;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCertificate_type() {
		return certificate_type;
	}
	public void setCertificate_type(String certificate_type) {
		this.certificate_type = certificate_type;
	}
	public String getID_num() {
		return ID_num;
	}
	public void setID_num(String iD_num) {
		ID_num = iD_num;
	}
	public String getSocial_safe_num() {
		return social_safe_num;
	}
	public void setSocial_safe_num(String social_safe_num) {
		this.social_safe_num = social_safe_num;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSelf_paying() {
		return self_paying;
	}
	public void setSelf_paying(int self_paying) {
		this.self_paying = self_paying;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getEarly_appointment() {
		return early_appointment;
	}
	public void setEarly_appointment(String early_appointment) {
		this.early_appointment = early_appointment;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNoted() {
		return noted;
	}
	public void setNoted(String noted) {
		this.noted = noted;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getSection_id() {
		return section_id;
	}
	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getRegistration_fee() {
		return registration_fee;
	}
	public void setRegistration_fee(double registration_fee) {
		this.registration_fee = registration_fee;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Certificate_type getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate_type certificate) {
		this.certificate = certificate;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Registration_infor [medical_record=" + medical_record + ", name=" + name + ", certificate_type="
				+ certificate_type + ", ID_num=" + ID_num + ", social_safe_num=" + social_safe_num + ", phone=" + phone
				+ ", self_paying=" + self_paying + ", sex=" + sex + ", career=" + career + ", early_appointment="
				+ early_appointment + ", doctor_id=" + doctor_id + ", status=" + status + ", noted=" + noted + ", time="
				+ time + ", section_id=" + section_id + ", age=" + age + ", registration_fee=" + registration_fee
				+ ", doctor=" + doctor + ", certificate=" + certificate + ", section=" + section + "]";
	}
	
	
}
