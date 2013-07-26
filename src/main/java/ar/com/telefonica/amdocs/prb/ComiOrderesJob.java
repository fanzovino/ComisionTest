package ar.com.telefonica.amdocs.prb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComiOrderesJob {
	private static final String  CONFIG_PATH= "classpath*:spring/application-ctx-prb.xml";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.print("StartUp");
		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		
		IOrdenesLoop OrdenesLoops = (IOrdenesLoop) context.getBean("Comi-Ordenes-Loop");
		
		String Status = OrdenesLoops.run( context.getBean("Comi-Ordenes-Loop"));
		
		
		
		
//		IOrdenesLoop OrdenesLoops = (IOrdenesLoop) context.getBean("Comi-Ordenes-Loop");
//		
//		String Status = OrdenesLoops.run();		
	}
	
	

}
