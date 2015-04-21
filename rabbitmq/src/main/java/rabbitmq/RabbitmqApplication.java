package rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource(value = { "classpath:/jdbc.properites","classpath:/rabbitmq.properties" }) 
public class RabbitmqApplication {

    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(new Object[] {RabbitmqApplication.class});
    	application.setWebEnvironment(false);
    	application.run( args);
    }
}
