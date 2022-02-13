package br.com.alexandremaia.model;

import java.io.Serializable;
import javax.persistence.*;
import br.com.alexandremaia.model.User;

@Entity
@Table(name="address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String street;
	
	@Column
	private Integer number;
	
	@Column
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@OneToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		return "Address [id= " + id + 
				"], street: " + street +
				", number: " + number;
	}
}
