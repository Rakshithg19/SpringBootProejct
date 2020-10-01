package com.xworkz.projecttask.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
@Component
public class MessageDTO implements Serializable {
	private Integer id;
	private String from;
	private String message;
	public MessageDTO() {
		log.info(this.getClass().getSimpleName() + " is created");
	}
}