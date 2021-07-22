package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//싱글톤 객체 - 단일 객체
public class Main2 {
    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("greeter",Greeter.class);
        Greeter g2 = ctx.getBean("greeter",Greeter.class);
        System.out.println("(g1==g2)="+(g1==g2)); //true 반환, g1과 g2는 같은 객체 == 스프링은 @Bean 어노테이션에 대해 한 개의 빈 객체를 생성한다.
        ctx.close();
    }

}
