package agent;
//import org.aspectj.lang.JoinPoint; 
//import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.springframework.aop.MethodBeforeAdvice;
public class AgentBeforeAdvice implements MethodBeforeAdvice
{
  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable 
  {
        System.out.println("============before......agent=============");
        //System.out.println("执行的方法是：" + method.getName());
        //System.out.println("执行的参数是：" + Arrays.asList(args));
        //System.out.println("执行的对象是：" + target);
  }
}