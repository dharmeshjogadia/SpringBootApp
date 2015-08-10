package projStudent.projStudent;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    public DataSource dataSource(){
    	DriverManagerDataSource ds = new DriverManagerDataSource();
    	ds.setDriverClassName("org.postgresql.Driver");
    	ds.setUsername("postgres");
    	ds.setPassword("postgres");
    	ds.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
    	return ds;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
    	JdbcTemplate jt = new JdbcTemplate(dataSource());
    	return jt;
    }
    
   
}
