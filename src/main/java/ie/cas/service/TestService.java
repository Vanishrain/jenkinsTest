package ie.cas.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void test(String param, boolean flag){
        System.out.println(param);
    }
}
