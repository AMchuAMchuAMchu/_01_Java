package com.atguigu.senior;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestString1001 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(TestString1001.class);

        BasicConfigurator.configure();

        logger.info(">>>果咩纳塞~~");

        logger.debug(">>>我的青春恋爱物语果然有问题...");

    }


    @Test
    public void testString1001(){

    }


}
