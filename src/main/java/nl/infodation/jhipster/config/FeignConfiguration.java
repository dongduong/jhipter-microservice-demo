package nl.infodation.jhipster.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "nl.infodation.jhipster")
public class FeignConfiguration {

}
