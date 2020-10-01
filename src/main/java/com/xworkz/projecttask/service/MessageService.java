package com.xworkz.projecttask.service;

import com.xworkz.projecttask.dto.MessageDTO;

public interface MessageService {
	public MessageDTO convertAndSaveMessageDetails(MessageDTO messageDTO);
}
