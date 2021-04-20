package com.javademo.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "customers")


	public class Customer {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name = "full_name")
		private String fullName;
		
		
		private String email;
		private String country;

		
		public Customer() {
			
		}
		
		public Customer(String fullName, String email, String country) {
			super();
			this.fullName = fullName;
			this.email = email;
			this.country = country;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFirstName(String fullName) {
			this.fullName = fullName;
		}
			public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCountry() {
			return country;
		}
		public void setAddress(String country) {
			this.country = country;
		}
		
		
		

	}


