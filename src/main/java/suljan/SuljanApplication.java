package suljan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude = DataSourceAutoConfiguration.class) -> DB사용안할 때 임시 사용
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SuljanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuljanApplication.class, args);
	}

}
