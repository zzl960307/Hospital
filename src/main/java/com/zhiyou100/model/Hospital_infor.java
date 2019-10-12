package com.zhiyou100.model;

public class Hospital_infor {
	private String medical_record;
	private String caregiver;
	private String bed_id;
	private double pay_the_deposit;
	private String state_illness;
	
	
	private Doctor doctor;
	private	Registration_infor registration;
	private Section section;
	
	
	
	
	public String getMedical_record() {
		return medical_record;
	}
	public void setMedical_record(String medical_record) {
		this.medical_record = medical_record;
	}
	public String getCaregiver() {
		return caregiver;
	}
	public void setCaregiver(String caregiver) {
		this.caregiver = caregiver;
	}
	public String getBed_id() {
		return bed_id;
	}
	public void setBed_id(String bed_id) {
		this.bed_id = bed_id;
	}
	public double getPay_the_deposit() {
		return pay_the_deposit;
	}
	public void setPay_the_deposit(double pay_the_deposit) {
		this.pay_the_deposit = pay_the_deposit;
	}
	public String getState_illness() {
		return state_illness;
	}
	public void setState_illness(String state_illness) {
		this.state_illness = state_illness;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Registration_infor getRegistration() {
		return registration;
	}
	public void setRegistration(Registration_infor registration) {
		this.registration = registration;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Hospital_infor [medical_record=" + medical_record + ", caregiver=" + caregiver + ", bed_id=" + bed_id
				+ ", pay_the_deposit=" + pay_the_deposit + ", state_illness=" + state_illness + ", doctor=" + doctor
				+ ", registration=" + registration + ", section=" + section + "]";
	}
	
}
