package com.tpv.controller;

import com.tpv.model.TopicImpl;

import java.util.List;

import com.tpv.entity.Topic;
import com.tpv.model.TopicDao;

public class TopicController {
	TopicDao topicDao = new TopicImpl();
	
	public List<Topic> getListTopic(){
		return topicDao.getList();
	}
}
