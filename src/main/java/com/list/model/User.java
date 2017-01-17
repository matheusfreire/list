package com.list.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User implements Serializable{

	private static final long serialVersionUID = -6172483943294206398L;
	
	@Id
	@GeneratedValue(generator="users_seq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="users_seq",sequenceName="USERS_SEQ", allocationSize=1)
	@Getter @Setter
	private long id;
	
	@Column(name="email")
	@Getter @Setter
	private String email;
	
	@Getter @Setter
	private String password;
	

}
