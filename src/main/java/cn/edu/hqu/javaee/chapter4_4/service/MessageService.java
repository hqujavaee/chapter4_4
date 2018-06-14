package cn.edu.hqu.javaee.chapter4_4.service;

import java.util.List;

import cn.edu.hqu.javaee.chapter4_4.entity.Message;

public interface MessageService {
	public List<Message> getMessageByUserName(String userName);
	public void saveMessage(Message message);

}
