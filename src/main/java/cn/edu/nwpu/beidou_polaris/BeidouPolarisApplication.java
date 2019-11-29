package cn.edu.nwpu.beidou_polaris;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.nwpu.beidou_polaris.mapper")
public class BeidouPolarisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeidouPolarisApplication.class, args);
    }

}
