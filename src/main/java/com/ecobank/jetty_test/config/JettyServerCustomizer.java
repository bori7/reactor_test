package com.ecobank.jetty_test.config;

import org.springframework.boot.web.embedded.jetty.JettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class JettyServerCustomizer implements WebServerFactoryCustomizer<JettyReactiveWebServerFactory> {

    @Override
    public void customize(JettyReactiveWebServerFactory factory) {
        factory.addServerCustomizers(server -> {
            // Customize the Jetty Server here
            server.setStopTimeout(5000);
            server.setStopAtShutdown(true);
        });
    }

//    @Override
//    public void customize(JettyReactiveWebServerFactory factory) {
//        factory.addServerCustomizers((Server server) -> {
//            // Customize Jetty with a thread pool
//            QueuedThreadPool threadPool = new QueuedThreadPool();
//            threadPool.setMaxThreads(200); // Set max threads
//            threadPool.setMinThreads(10);  // Set min threads
//            server.setThreadPool(threadPool);
//        });
//    }
}