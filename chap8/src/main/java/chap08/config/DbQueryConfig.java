package chap08.config;


import chap08.dbquery.DbQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbQueryConfig {

	@Autowired
	private javax.sql.DataSource dataSource;

	@Bean
	public DbQuery dbQuery() {
		return new DbQuery(dataSource);
	}
}
