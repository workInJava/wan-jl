package com.wan.jl.spring;

import com.wan.jl.Hello;
import lombok.Data;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
@Data
public class IocTest {



    public static void main(String[] arges){
        //1.创建ioc配置文件的抽象资源，
        ClassPathResource resource = new ClassPathResource("beans.xml");
        //2.创建BeanFactory,
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //3.创建一个载入BeanDefinition的读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        //4.读入配置信息
        reader.loadBeanDefinitions(resource);
        Hello iocTest = (Hello)factory.getBean("iocTest");
      //  Hello iocTest1 = (Hello)factory.getBean("iocTest1");
      //  System.out.println(iocTest.equals(iocTest1));

     //   ClassPathResource resource = new ClassPathResource("beans.xml");
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beans1.xml");
        Hello iocTest2 = (Hello)context1.getBean("iocTest");
        System.out.println(iocTest2.getTest());
        System.out.println(iocTest2 == iocTest);

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Hello iocTest1 = (Hello)context.getBean("iocTest");
        System.out.println(iocTest1.getTest());
        System.out.println(iocTest1 == iocTest);
    }
}
