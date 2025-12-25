package net.my.maven.TestHibernateApp.app;

import net.my.maven.TestHibernateApp.domain.Test;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration configuration = new AnnotationConfiguration()
				.addPackage("net.my.maven.TestHibernateApp.domain")
				.addAnnotatedClass(Test.class);
		
		Session session = configuration.buildSessionFactory().openSession();
		
		//User userOne = new User();
		Test userOne = new Test();
		userOne.setUsername("hello");
		userOne.setPassword("world");
		session.save(userOne);
		session.close();
		
	}

}
