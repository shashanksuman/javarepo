package com.lti.exam.model;

import java.util.List;

public class Question {
	
	private String question;
	private List<Option> options;
	public Question(String question) {
		super();
		this.question = question;
	}
	public String getQuestion() {
		return question;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
}
