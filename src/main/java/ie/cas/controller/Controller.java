package ie.cas.controller;

import ie.cas.StringUtils;
import ie.cas.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Scope("prototype")
public class Controller {
    private int count = 1;

    @Autowired
    TestService testService;


    @GetMapping(value = "/test")
    public void test(){
        StringUtils.getContext();
        System.out.println(count);
        testService.test("this is aop test",true);
        System.out.println("test");
        count++;

    }
}
