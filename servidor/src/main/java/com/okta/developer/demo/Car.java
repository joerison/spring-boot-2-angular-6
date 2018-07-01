package com.okta.developer.demo;

import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
	@Id
	@GeneratedValue
	private Long id;
	private @NonNull String name;

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

}