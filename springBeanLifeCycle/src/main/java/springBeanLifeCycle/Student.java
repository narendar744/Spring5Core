package springBeanLifeCycle;

public class Student {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	public void startup() {
		System.out.println("study till 9 pm");
	}
	public void sleep() {
		System.out.println("sleep till 6am");
	}

}
