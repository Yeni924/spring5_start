package chap09_17.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//지정한 범위의 컨트롤러에 공통으로사용될 설정을 지정할수 있다.
@ControllerAdvice("spring")  //spring패키지와 하위 패키지에서 handleRuntimeExcepiton() 메서드를 통해서 익셉션을 처리할 수 있다.
public class CommonExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException() {
		return "error/commonException";
	}
}
