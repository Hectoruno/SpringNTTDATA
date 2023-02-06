package org.springframework.samples.petclinic.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "bills")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_number")
	@NotEmpty
	private int idNumber;

	@Column(name = "money")
	@NotEmpty
	private double money;

	@Column(name = "payment")
	@NotEmpty
	@Digits(fraction = 0, integer = 10)
	private Date payment;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Date getPayment() {
		return this.payment;
	}

	public void setPayment(Date payment) {
		this.payment = payment;
	}
	
}