package com.apphotel.hotelalura;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//la clase ServletInitializer es utilizada para configurar la aplicacion Srping Boot
//para que pueda ser desplegada en un contenedor servlet y el metodo configure()
// establece la clase principal de la aplicacion que se cargará al desplegarla
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HotelaluraApplication.class);
    }
}
