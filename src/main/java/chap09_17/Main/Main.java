package chap09_17.Main;

import chap09_17.config.DbConfig;
import chap09_17.config.DbQueryConfig;
import chap09_17.dbquery.DbQuery;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class,
                DbQueryConfig.class);

        DbQuery dbQuery = ctx.getBean(DbQuery.class);
        int count = dbQuery.count();
        System.out.println(count);
        ctx.close();
    }
}
