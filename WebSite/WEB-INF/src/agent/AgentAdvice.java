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
        System.out.println("ǰ��֪ͨ");
        System.out.println("Ŀ�귽����Ϊ:" + joinPoint.getSignature().getName());
        System.out.println("Ŀ�귽�������������:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("������Ķ���:" + joinPoint.getTarget());
        System.out.println("��������Լ�:" + joinPoint.getThis());
    }
    public void after(Object returnval)
    {
        System.out.println("����ֵ�Ľ��Ϊ��"+returnval);
        System.out.println("����֪ͨ");
    }
    
    public Object around(ProceedingJoinPoint proceedingJoinPoint)
    throws Throwable
    {
        System.out.println("����ǰ����ǿ...");
	Object o = proceedingJoinPoint.proceed();
        System.out.println("Ŀ�귽����Ϊ:" + proceedingJoinPoint.getSignature().getName());
        System.out.println("Ŀ�귽�������������:" + proceedingJoinPoint.getSignature().getDeclaringTypeName());
        System.out.println("������Ķ���:" + proceedingJoinPoint.getTarget());
        System.out.println("��������Լ�:" + proceedingJoinPoint.getThis());
        System.out.println("���ƺ�����ǿ...");
        return o;
    }
    public void afterThrowing(Throwable e)
    {
        System.out.println("�쳣֪ͨ");
    }
}