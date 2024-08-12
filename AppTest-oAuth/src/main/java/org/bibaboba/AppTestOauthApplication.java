package org.bibaboba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppTestOauthApplication extends SpringBootServletInitializer{

        // for war
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(AppTestOauthApplication.class);
        }

        // for jar
        public static void main(String[] args) {
            SpringApplication.run(AppTestOauthApplication.class, args);
        }


}
