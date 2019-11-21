package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//123
public class DynamicSubject implements InvocationHandler {

	private Object sub;
	
	public DynamicSubject(Object sub) {
		super();
		this.sub = sub;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		method.invoke(this.sub, args);
		System.out.println("after..." + method);
	    
		return null;
	}
}
