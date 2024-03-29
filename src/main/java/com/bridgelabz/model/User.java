package com.bridgelabz.model;

import java.io.Serializable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *  
 *  Purpose:Model for the User data Registration
 *
 * @author Ashutosh
 *  @version 1.0
 *  @since   05-11-2019
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 *   
	 */
	
	private static final long serialVersionUID = -5086924757456958253L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "fname")
	@NotNull
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "emailid")
	private String emailid;
	@Column(name = "password")
	private String password;
	@Column(name = "phoneno")
	private String phoneno;
	@Column(name = "dob")
	private String dob;
	@Column(name = "registerDate")
	private LocalDateTime registerDate = LocalDateTime.now();
	@Column(name = "updateddate")
	private LocalDateTime updatedDate;
	@Column(name = "verification")
	private boolean verify;
	@Column(name="profile")
	private String profilepic;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid + ", password="
				+ password + ", phoneno=" + phoneno + ", dob=" + dob + ", registerDate=" + registerDate
				+ ", updatedDate=" + updatedDate + ", verify=" + verify + ", profilepic=" + profilepic + "]";
	}

	public User(@NotNull String fname, String lname, String emailid, String password, String phoneno, String dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.password = password;
		this.phoneno = phoneno;
		this.dob = dob;
	}
public User() {
	
}
 
}
