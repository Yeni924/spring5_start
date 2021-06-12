package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args){
        //자바 설정에서 정보를 읽어와 빈 객체 생성하고 관리, AppContext 클래스를 생성자로 넘기고, AppContext의 정보를 읽어온다.

        //1. 컨테이너 초기화
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);


        //2. 컨테이너에서 빈 객체를 구해서 사용
        Greeter g= ctx.getBean("greeter",Greeter.class);  // getBean("메서 이름인 빈 객체 이름",검색할 빈 객체의 타입) , gretter()메서드가 생성한 Greeter객체를 생성한다.
        String msg = g.greet("스프링");
        System.out.println(msg);

        //3. 컨테이너 종료
        ctx.close();

    }

}
