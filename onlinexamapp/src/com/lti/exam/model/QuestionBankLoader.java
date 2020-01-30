package com.lti.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	public List<Question> loadQuestionsOnJava() {
		QuestionBank qb = new QuestionBank();
		qb.addSubject("Java");
		
		Question q = new Question("How do you feel Shashank today?");
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("I feel very good",false));
		options.add(new Option("I feel very nice",false));
		options.add(new Option("I am very happy today,  because she says 'YES'",true));
		options.add(new Option("I am very enthusiastic",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);
		
		q = new Question("What is Java?");
		options = new ArrayList<Option>();
		options.add(new Option("Java is an OS",false));
		options.add(new Option("Java is a Database",false));
		options.add(new Option("Java is a programming language",true));
		options.add(new Option("Java is a browser",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);
		
		q = new Question("Why I am here?");
		options = new ArrayList<Option>();
		options.add(new Option("I need Money",false));
		options.add(new Option("I need Knowledge",false));
		options.add(new Option("I want to learn",true));
		options.add(new Option("I want to enjoy life on bench",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);
		
		return qb.getQuestionsFor("Java");
	}

}
