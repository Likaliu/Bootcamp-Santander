package com.liane.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_investments")
@NoArgsConstructor
@AllArgsConstructor
public class Investments {
	
	
	public Investments(Long id, String name, BigDecimal value, Date purchaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.purchaseDate = purchaseDate;
	}
	
	

	public Investments() {
		super();
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(precision = 13, scale = 2)
    private BigDecimal value;
    

    @Column
    private Date purchaseDate;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getValue() {
		return value;
	}


	public void setValue(BigDecimal value) {
		this.value = value;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
    
	
	
}
