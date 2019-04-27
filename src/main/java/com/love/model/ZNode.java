package com.love.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZNode {
	private String name;

	@JsonInclude (JsonInclude.Include.NON_NULL)
	private List<ZNode> zNodes;

	public ZNode() {
	}

	public ZNode(String name) {
		this.name = name;
	}

	public void addEmptyChildren(){
		if(this.zNodes==null){
			this.zNodes = new ArrayList<>();
		}
	}

	public ZNode(List<ZNode> zNodes) {
		this.zNodes = zNodes;
	}

	public List<ZNode> getzNodes() {
		return zNodes;
	}

	public void setzNodes(List<ZNode> zNodes) {
		this.zNodes = zNodes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public String toString() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			String formattedString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
			System.out.println(formattedString);
			formattedString = formattedString.replace("\"zNodes\" : ","");
			return formattedString;
		}
		catch (JsonProcessingException e) {
			return this.toString();
		}
	}
}
