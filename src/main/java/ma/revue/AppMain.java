
package ma.revue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import ma.revue.configuration.AppConfig;

public class AppMain {
	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	}
}
