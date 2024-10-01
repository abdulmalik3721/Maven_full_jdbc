package in.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

	@Bean
	public DriverManagerDataSource myDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:3306/mySpringg");
		dataSource.setUsername("root");
		dataSource.setPassword("Abdul3721@@");

		return dataSource;

	}

	@Bean
	public JdbcTemplate myJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(myDataSource());
		
		return jdbcTemplate;

	}
	

}
