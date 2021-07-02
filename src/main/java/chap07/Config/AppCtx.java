package chap07.Config;


import chap07.Aspect.ExeTimeAspect;
import chap07.test.Calculator;
import chap07.test.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // @Aspect를 공통 기능으로 적용하기 위해 설정 클래스에 필요함
public class AppCtx {

	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}

	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}

}
