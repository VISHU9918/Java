package inheritance;

public class Person2 {
		private String name;
		private int age;
		private int pId;	
		
		public Person2(String name,int age,int pId) {
			this.name = name;
			this.age = age;
			this.pId = pId;
		}
		
		public void getData() {
		System.out.println("Person Details:"+name+","+age+","+pId);
		}

	}


