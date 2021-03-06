package com.elti.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by e.sh. on 13-Sep-18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

}
