package java;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import javax.servlet.ServletRegistration;

public class Main {
    public static void main(String[] args) {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.yourpackage");

        ServletRegistration.Dynamic servlet =
                javax.servlet.ServletContext.addServlet("Jersey", new ServletContainer(config));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/api/*");
    }
}
