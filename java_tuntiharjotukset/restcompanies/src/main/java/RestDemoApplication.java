
import java.util.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/* 
 * Adding all classes that are using JAX-RS to implement RESTful services with Java 
 * 
 * By defining the javax.ws.rs.core.Application subclass, classes returned from its methods are registered to the JAX-RS runtime environment
 * When configuring the web.xml file, you must specify the javax.ws.rs.core.Application subclass as a parameter to the servlet or filter.  
 */

@ApplicationPath("/api")
public class RestDemoApplication extends Application {
    /*public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(restservice.CompanyResource.class);
        //classes.add(TimeService.class);
        return classes;
    }*/
}