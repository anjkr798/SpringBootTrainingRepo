/**
 * 
 */
package com.anjan.jpaapp.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author anjdas
 *
 */
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		super();
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String description) {
		this.description = description;
	}
	
	
	
}
