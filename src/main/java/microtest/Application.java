package microtest;

import microtest.render.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import microtest.model.Person;
import microtest.service.Database;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 14:19
 * Declaration: All Rights Reserved !!!
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
    Page page = ctx.getBean("page", Page.class);
//	Person person = ctx.getBean("person", Person.class);
//    Person person = ctx.getBean("person1", Person.class);
//	Database database =ctx.getBean("database", Database.class);
        
	/*person.setFirstName("Aaaa");
	person.setLastName("Bbbb");*/
	/*database.setPerson(person);
	page.setDatabase(database);*/

	page.render();
    }
}
