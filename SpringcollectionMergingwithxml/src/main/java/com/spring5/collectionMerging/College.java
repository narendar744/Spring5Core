package com.spring5.collectionMerging;

import java.util.Set;

public class College {
	private String branch;
	private Set<String> subjects;

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "College [branch=" + branch + ", subjects=" + subjects + "]";
	}

}
