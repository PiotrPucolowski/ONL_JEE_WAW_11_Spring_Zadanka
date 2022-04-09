package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 1 sposób
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printMessage();

        System.out.println("---------");

        //2 sposób
        HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
        helloWorld1.printMessage();





        context.close();
    }
}
