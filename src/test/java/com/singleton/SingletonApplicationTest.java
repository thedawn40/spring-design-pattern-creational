package com.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SingletonApplicationTest
 */
@SpringBootTest(classes = SingletonApplication.class)
public class SingletonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void testSingleton(){
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println("luthfi "+counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }

    
    private void incrementCounterAsync(Counter counter, int total){
        new Thread(() -> {
            for(int i =0; i < total; i++){
                counter.increment();
            }
        }).start();
    }

    @Test
    void incrementRaceCondition() throws InterruptedException{
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 1000000);
        incrementCounterAsync(counter2, 1000000);

        Thread.sleep(5_000L);
        
        System.out.println("test "+counter1.getValue());
        System.out.println("test "+counter2.getValue());

        
    }

    
}