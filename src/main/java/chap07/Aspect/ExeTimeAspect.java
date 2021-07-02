package chap07.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect //Advice와 Pontcut을 함께 제공
public class ExeTimeAspect {

    @Pointcut("execution(public * chap07..*(..))") //공통 기능을 적용할 대상
    private void publicTarget() {
    }

    @Around("publicTarget()") //공통 기능을 적용한다는 것을 의미, publicTarget메서드는 @Around가 붙은 measure()메서드를 적용한다.
    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {// ProceedingJoinPoint 파라미터는 프록시 대상 객체의 메서드를 호출할 때 사용
        long start = System.nanoTime();
        try {
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long finish = System.nanoTime();
            Signature sig = joinPoint.getSignature();
            System.out.printf("%s.%s(%s) 실행 시간 : %d ns\n",
                    joinPoint.getTarget().getClass().getSimpleName(),
                    sig.getName(), Arrays.toString(joinPoint.getArgs()),
                    (finish - start));
        }
    }

}
