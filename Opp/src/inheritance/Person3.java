package inheritance;

public class Person3 {
	private String name;
	private int age;
	private int pId;	
	
	public void setData(String name,int age,int pId) {
		this.name = name;
		this.age = age;
		this.pId = pId;
	}
	
	public void getData() {
	System.out.println(name+","+age+","+pId);
	}

}
