package courses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Starter setup for Spring Boot Application from a Maven application
//Took a fresh Maven Application and added the dependencies needed to make it a Spring Boot Application

@SpringBootApplication
public class CourseAPIAppV2 {

    public static void main (String[] args){
        SpringApplication.run(CourseAPIAppV2.class,args);
    }
}
