package sn.isi.l3gl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"sn.isi.l3gl.api", "sn.isi.l3gl.core"})
@EntityScan(basePackages = "sn.isi.l3gl.core.entity")
@EnableJpaRepositories(basePackages = "sn.isi.l3gl.core.repository")
public class ProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}
