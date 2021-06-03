package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    // greeter() 스프링이 관리하는 빈객체로 등록
    @Bean
        public Greeter greeter(){
        Greeter g= new Greeter();
        g.setFormat("%s, 권예은 안뇽!");
        return g;
    }

}
