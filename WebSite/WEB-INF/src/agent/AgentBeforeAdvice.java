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
        //System.out.println("ִ�еķ����ǣ�" + method.getName());
        //System.out.println("ִ�еĲ����ǣ�" + Arrays.asList(args));
        //System.out.println("ִ�еĶ����ǣ�" + target);
  }
}