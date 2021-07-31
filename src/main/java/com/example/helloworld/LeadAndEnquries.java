package com.example.helloworld;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "rmId" })
@Getter
@Setter
public class LeadAndEnquries implements Serializable {
	@JsonProperty("ownerId")
	private String ownerId;
	@JsonProperty("leadandenquriesId")
	private String leadandenquriesId;
	@JsonProperty("dueDate")
	private String dueDate;
	@JsonProperty("leadStatus")
	private String leadStatus;
	@JsonProperty("customer")
	private Customer customer;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonPropertyOrder({ "rmId" })
	@Getter
	@Setter
	public static class Customer {
		@JsonProperty("cin")
		private String cin;
		@JsonProperty("household")
		private String household;
		@JsonProperty("cust_name")
		private String cust_name;
		@JsonProperty("contact_num")
		private String contact_num;
		@JsonProperty("email_addr")
		private String email_addr;

	}
}
