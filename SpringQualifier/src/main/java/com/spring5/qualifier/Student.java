package com.spring5.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Student implements Exams {
	@Autowired
	//@Qualifier("morningWork")
	@Qualifier("eveningWork")
	private Duties duties;

	@Override
	public String physicsExm() {
		return "physics exam will be held on next week 1st day  and "+ duties.Work();
	}

	@Override
	public String mathsExm() {
		return "Mathematics exam will be held on next week last day and "+duties.Work();
	}

}
