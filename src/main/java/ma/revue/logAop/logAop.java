//package ma.revue.logAop;
//
//import org.aopalliance.intercept.MethodInterceptor;
//
//public class logAop implements MethodInterceptor {
//	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
//		System.out.println("Method name : " + methodInvocation.getMethod().getName());
//		System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
//		Object result = methodInvocation.proceed();
//		return result;
//	}
//}
