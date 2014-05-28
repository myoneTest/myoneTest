package net.daum.myone.frontapi.aop;

import net.daum.myone.frontapi.util.LoggerHelper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
public class LoggingAspect {
	
	private Logger log = LoggerHelper.getLogger();
	
	@Around(value="execution(* net.daum.myone.frontapi.mvc..*(..))")
	public Object logAroundController(ProceedingJoinPoint joinPoint) throws Throwable {
		Object returnValue = null;
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		printLog(joinPoint, "START", stopWatch);
		returnValue = joinPoint.proceed();
		stopWatch.stop();
		printLog(joinPoint, "END", stopWatch);
		return returnValue;
	}
	
    @AfterThrowing(pointcut="execution(* net.daum.myone.frontapi.mvc..*(..))", throwing="error")
    public void logThrowError(JoinPoint joinPoint, Throwable error) {
        printLogError(joinPoint, error);
        
    }
	
	private void printLogError(JoinPoint joinPoint, Throwable error) {
		log.error(getUUID()+" [" + joinPoint.getSignature().getDeclaringType().getSimpleName() +"." + joinPoint.getSignature().getName()+ " : "+error.getStackTrace()[0].getLineNumber()+"]" + " ERROR : "+error.toString());
	}
	
	private void printLog(ProceedingJoinPoint joinPoint, String msg, StopWatch stopWatch) throws Throwable {
		log.info("[" + joinPoint.getSignature().getDeclaringType().getSimpleName() +": " + joinPoint.getSignature().getName()+ "]  "+getUUID()+" " + msg + " "+stopWatch.getTotalTimeMillis());
	}
	
	private String getUUID() {
		return (String) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getAttribute("UUID");
	}
}
