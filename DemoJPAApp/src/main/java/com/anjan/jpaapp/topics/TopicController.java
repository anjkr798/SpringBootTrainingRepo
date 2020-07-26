/**
 * 
 */
package com.anjan.jpaapp.topics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anjdas
 *
 */
@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/Topics")
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}
	
	@RequestMapping("/Topics/{id}")
	private Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/Topics")
	public void addTopics(@RequestBody Topic topic) {

		topicService.addTopic(topic);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/Topics/{id}")
	public void updateTopics(@RequestBody Topic topic,@PathVariable String id) {

		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Topics/{id}")
	public void deleteTopics(@PathVariable String id) {

		topicService.deleteTopic(id);
	}
	
}
