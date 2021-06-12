package Chap06.main;

import Chap06.spring.Client;
import Chap06.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);

        Client client = ctx.getBean(Client.class);
        client.send();

     //   ctx.close();
    }
}

