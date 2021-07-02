package chap08.main;

import chap08.config.DbConfig;
import chap08.config.DbQueryConfig;
import chap08.dbquery.DbQuery;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainUsingDbQuery {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class,
				DbQueryConfig.class);

		DbQuery dbQuery = ctx.getBean(DbQuery.class);
		int count = dbQuery.count();
		System.out.println(count);
		ctx.close();
	}
}
