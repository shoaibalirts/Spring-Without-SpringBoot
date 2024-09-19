# Without Spring Boot:

Created a project using maven
Search from google as “spring context” and copy and pace the repository code in pom.xml

Update the pom.xml and you will see in External Libraries are shown as given in pom.xml
After step 3, we can use create ApplicationContext (IoC container). As ApplicationContext is an interface so we can not instantiate its object. We have to instantiate its class object which ClassPathXmlApplication which requires an xml configuration. We give a spring.xml and provides its xml configuration there.
Place spring.xml inside the resources folder.


In xml we can name any tag but we have to provide its definition. E.g. we used bean here and if we have to access it we will use getBean(“dev”) or getBean(Dev.class)

