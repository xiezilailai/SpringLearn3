package com.xiezilailai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 蝎子莱莱123 on 2016/2/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class test {
    @Resource(name = "accountService")
//    @Resource(name = "accountServiceProxy")
    private AccountService accountService;
   @Test
    public void demo1(){
        accountService.transfer("aaa","bbb",200d);
   }

}
