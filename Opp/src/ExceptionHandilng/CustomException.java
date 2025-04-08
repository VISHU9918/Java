package ExceptionHandilng;

public class CustomException {
	
		int age;

		public CustomException(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}
		public void checkAge(int age) throws InvalidAgeException{
			if(age<0||age>120) {
				
				throw new InvalidAgeException("Invalid age: "+age);
		
			}
			System.out.println("Valid Age: "+age);

	}
		
		public static void main(String[] args) {
			CustomException c=new CustomException(150);
			System.out.println("age: "+c.getAge());
			
			try {
				c.checkAge(150);
			}catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
			
			
		}

}
