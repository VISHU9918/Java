package nestedClass;

 public interface Greeting {
     void sayHello();
     
}

 class GreetingGenerator {
    public void generateGreeting() {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Welcome to the world of anonymous inner classes!");
            }
        };
        greeting.sayHello();
    }

    public static void main(String[] args) {
        GreetingGenerator generator = new GreetingGenerator();
        generator.generateGreeting();
    }
}
