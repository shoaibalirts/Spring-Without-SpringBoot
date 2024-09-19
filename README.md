# Without Spring Boot:
Created a project using maven
Search from google as “spring context” and copy and pace the repository code in pom.xml
<dependencies>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-context</artifactId>
<version>6.1.12</version>
</dependency>
</dependencies>

Update the pom.xml and you will see in External Libraries are shown as given in pom.xml
After step 3, we can use create ApplicationContext (IoC container). As ApplicationContext is an interface so we can not instantiate its object. We have to instantiate its class object which ClassPathXmlApplication which requires an xml configuration. We give a spring.xml and provides its xml configuration there.
Place spring.xml inside the resources folder.
Main.java
package com.namenets;
import org.springframework.context.ApplicationContext;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.springframework.context.support.ClassPathXmlApplicationContext;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
Dev obj=(Dev) context.getBean(Dev.class);
obj.build();
}
}
Dev.java
package com.namenets;
public class Dev {
public void build(){
System.out.println("Working on awesome project");
}
}

spring.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">



   <bean id="dev" class="com.namenets.Dev">


   </bean>
</beans>

In xml we can name any tag but we have to provide its definition. E.g. we used bean here and if we have to access it we will use getBean(“dev”) or getBean(Dev.class)



Down casting:
getBean returns the typeof ‘Object’ so we have to downcaste it.
package com.namenets;
import org.springframework.context.ApplicationContext;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.springframework.context.support.ClassPathXmlApplicationContext;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
Dev obj=(Dev) context.getBean(Dev.class);
obj.build();
}
}
