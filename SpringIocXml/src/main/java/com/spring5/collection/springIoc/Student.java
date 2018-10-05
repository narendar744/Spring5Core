package com.spring5.collection.springIoc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.spring5.collection.springIoc.address.Address;
import com.spring5.collection.springIoc.greeting.Greeting;

public class Student {
	private String name;
	private List<String> payments;
		private Set<String> subjects;
		private Map<String, String> marks;
		private Properties emails;
		private Address address;
		private Greeting greeting;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Greeting getGreeting() {
			return greeting;
		}
		public void setGreeting(Greeting greeting) {
			this.greeting = greeting;
		}
		public List<String> getPayments() {
			return payments;
		}
		public void setPayments(List<String> payments) {
			this.payments = payments;
		}
		public Set<String> getSubjects() {
			return subjects;
		}
		public void setSubjects(Set<String> subjects) {
			this.subjects = subjects;
		}
		public Map<String, String> getMarks() {
			return marks;
		}
		public void setMarks(Map<String, String> marks) {
			this.marks = marks;
		}
		public Properties getEmails() {
			return emails;
		}
		public void setEmails(Properties emails) {
			this.emails = emails;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", payments=" + payments + ", subjects=" + subjects + ", marks=" + marks
					+ ", emails=" + emails + ", address=" + address.toString() + ", greeting=" + greeting.greeting("name") + "]";
		}
			

}
