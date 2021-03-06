package cn.edu.hqu.javaee.chapter4_4.service.Impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.hqu.javaee.chapter4_4.entity.Message;
import cn.edu.hqu.javaee.chapter4_4.repository.HquerRepository;
import cn.edu.hqu.javaee.chapter4_4.repository.MessageRepository;
import cn.edu.hqu.javaee.chapter4_4.service.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageRepository messageRepository;
	@Autowired
	HquerRepository hquerRepository;
	@Override
	public List<Message> getMessageByUserName(String userName) {
		return hquerRepository.findByUserName(userName).getMessageList();
	}
	@Override
	public void saveMessage(Message message) {
		messageRepository.save(message);
		
	}

}
