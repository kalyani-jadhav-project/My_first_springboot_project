package kalyanii.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("/hello/application.properties")
public class SpringBootKalyaniApplication {

	public static void main(String[] args) {

    ConfigurableApplicationContext container =SpringApplication.run(SpringBootKalyaniApplication.class, args);
	Myapp app=container.getBean(Myapp.class);
	System.out.println(app.getAppname());
	System.out.println(app.getAppversion());
	}

}
