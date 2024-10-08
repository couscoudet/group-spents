package com.tech_talent.group_spents.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Spent implements IEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String spentName;
	
	private Double amount;
	
	private LocalDateTime spendDate;
	
	private Date creationDate;
	
	private Date updateDate;
	
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project project;

	public String getSpentName() {
		return spentName;
	}

	public void setSpentName(String spentName) {
		this.spentName = spentName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getSpendDate() {
		return spendDate;
	}

	public void setSpendDate(LocalDateTime spendDate) {
		this.spendDate = spendDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	@Override
	public Date getCreationDate() {
		// TODO Auto-generated method stub
		return this.creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
		
	}

	@Override
	public Date getUpdateDate() {
		// TODO Auto-generated method stub
		return this.updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
		
	}

}
