package agent;
import org.aspectj.lang.JoinPoint; 
import org.aspectj.lang.ProceedingJoinPoint;
//import org.springframework.aop.aspectj.lang.ProceedingJoinPoint;
//import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import java.lang.reflect.Method;
import java.util.Arrays;
public class AgentAdvice
{
    public void before(JoinPoint joinPoint)
    {
        System.out.println("前置通知");
        System.out.println("目标方法名为:" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的类名:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("被代理的对象:" + joinPoint.getTarget());
        System.out.println("代理对象自己:" + joinPoint.getThis());
    }
    public void after(Object returnval)
    {
        System.out.println("返回值的结果为："+returnval);
        System.out.println("后置通知");
    }
    
    public Object around(ProceedingJoinPoint proceedingJoinPoint)
    throws Throwable
    {
        System.out.println("环绕前置增强...");
	Object o = proceedingJoinPoint.proceed();
        System.out.println("目标方法名为:" + proceedingJoinPoint.getSignature().getName());
        System.out.println("目标方法所属类的类名:" + proceedingJoinPoint.getSignature().getDeclaringTypeName());
        System.out.println("被代理的对象:" + proceedingJoinPoint.getTarget());
        System.out.println("代理对象自己:" + proceedingJoinPoint.getThis());
        System.out.println("环绕后置增强...");
        return o;
    }
    public void afterThrowing(Throwable e)
    {
        System.out.println("异常通知");
    }
}