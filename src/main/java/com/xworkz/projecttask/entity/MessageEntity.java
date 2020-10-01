package com.xworkz.projecttask.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Entity
@Table(name = "Message")
@Data
@Slf4j
public class MessageEntity implements Serializable {
	
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "fromm")
	private String from;
	@Column(name = "message")
	private String message;

	public MessageEntity() {
		log.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

}

