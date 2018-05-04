package com;


import com.zz.study.IStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by dell on 2018/5/4.
 */
public class Test {


    public static void main(String[] args) {
     //   System.out.println(classpath:applicationContext.xml);
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        IStudent is = (IStudent) ac.getBean("student");
        is.addStudent("zz");
    }
}
