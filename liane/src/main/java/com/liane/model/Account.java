package com.liane.model;

import java.math.BigDecimal;

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

@Entity(name = "tb_account")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
public class Account {
	
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Long id;

	    @Column(unique = true)
	    private String number;

	    private String agency;

	    @Column(precision = 13, scale = 2)
	    private BigDecimal balance;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getAgency() {
			return agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public BigDecimal getBalance() {
			return balance;
		}

		public void setBalance(BigDecimal balance) {
			this.balance = balance;
		}
	    
	 
	    
	

}
