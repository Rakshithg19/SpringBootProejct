package com.xworkz.projecttask.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.projecttask.dto.MessageDTO;
import com.xworkz.projecttask.entity.MessageEntity;
import com.xworkz.projecttask.repository.MessageRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private  MessageRepository messageRepository;

	@Autowired
	private ModelMapper modelMapper;
	public MessageServiceImpl() {
		log.info(this.getClass().getSimpleName() + " is created");
	}

	public MessageDTO convertAndSaveMessageDetails(MessageDTO messageDTO) {
		log.info("invoking convertAndSaveMessageDetails() " + this.getClass().getSimpleName());
		try {
			MessageEntity messageEntity = new MessageEntity();
			messageEntity.setFrom(messageDTO.getFrom());
			messageEntity.setMessage(messageDTO.getMessage());
			messageEntity = messageRepository.save(messageEntity);
			log.info("calling the model mapper class");
			messageEntity = modelMapper.map(messageDTO, MessageEntity.class);
			messageRepository.save(messageEntity);
			if (messageEntity.getId()!= 0) {
				messageDTO.setId(messageEntity.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return messageDTO;
	}

}