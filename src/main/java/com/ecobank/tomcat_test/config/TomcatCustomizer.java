package com.ecobank.tomcat_test.config;

import org.springframework.boot.web.embedded.tomcat.TomcatReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class TomcatCustomizer implements WebServerFactoryCustomizer<TomcatReactiveWebServerFactory> {

    @Override
    public void customize(TomcatReactiveWebServerFactory factory) {
        factory.addConnectorCustomizers(connector -> {
            connector.setPort(8087);
            connector.setProperty("maxThreads", "200");
            connector.setProperty("connectionTimeout", "5000");
        });
    }
}
