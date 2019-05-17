package ie.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;


@SpringBootApplication
public class SpringbootApplicationTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        int count = 0;
        Spliterator<Integer> spliterator = arrayList.spliterator();
        spliterator.trySplit();
        System.out.println(spliterator.estimateSize());
        spliterator.tryAdvance(x-> System.out.println(x));
        spliterator.tryAdvance(x-> System.out.println(x));
        SpringApplication.run(SpringbootApplicationTest.class,args);

    }
}
