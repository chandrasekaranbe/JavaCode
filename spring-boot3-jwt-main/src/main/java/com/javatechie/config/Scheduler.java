package com.javatechie.config;


import com.javatechie.dto.Product;
import com.javatechie.service.ProductService;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Scheduler {


    @Autowired
    private ProductService service;

    @Scheduled(cron = "0 */3 * * * ?")
    @SchedulerLock(name = "shortRunningTask", lockAtMostFor = "50s",lockAtLeastFor = "30s")
      public void shortRunningTask() {
        System.out.println("Start short running task" + new Date());
        List<Product> products = service.getProducts();
        System.out.println("products List" + products.stream().collect(Collectors.toList()));
    }
}
