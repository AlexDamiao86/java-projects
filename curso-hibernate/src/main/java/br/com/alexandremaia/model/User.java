package br.com.alexandremaia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import br.com.alexandremaia.model.Address; 

// Table
@Entity
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Columns
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id; 
	
	@Column(name="username")
	private String username; 
	
	@Column(name="name")
	private String name; 
	
	@Column(name="lastname")
	private String lastname; 
	
	@Column
	private Address address; 
	
	@Column(name="createDate")
	private Date createDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@OneToOne(mappedBy="user")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	} 
	
	@Override
	public String toString() {
		return "User [id= " + id + 
				"], username: " + username + 
				", name: " + name + 
				", lastname: " + lastname + 
				", createDate: " + createDate;
	}
	
}
