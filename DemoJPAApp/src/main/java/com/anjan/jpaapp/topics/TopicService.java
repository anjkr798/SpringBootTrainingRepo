/**
 * 
 */
package com.anjan.jpaapp.topics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anjdas
 *
 */
@Service
public class TopicService {

	@Autowired
	private TopicPersistanceRepository topicPersistanceRepository; 

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<Topic>();
		topicPersistanceRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {

		return topicPersistanceRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {

		topicPersistanceRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {

		topicPersistanceRepository.save(topic);
	}

	public void deleteTopic(String id) {

		topicPersistanceRepository.deleteById(id);
	}
}
