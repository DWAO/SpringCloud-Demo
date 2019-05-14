package controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2018-9-20.
 */
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigServiceApplication {
    public static void main(String[] args) {
       new SpringApplicationBuilder(ConfigServiceApplication.class).web(true).run(args);
    }
}
