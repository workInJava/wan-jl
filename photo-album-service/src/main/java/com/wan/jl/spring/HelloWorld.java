package com.wan.jl.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
   private String message;


   public HelloWorld(){
      System.out.println("无参数构造");
   }

   public HelloWorld(String message){
      System.out.println("有参数构造");
      this.message = message;
   }

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }

   @Override
   public void setBeanName(String name) {
      System.out.println("bean name aware 获取id="+name);
   }



   @Override
   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      System.out.println("setBeanFactory:"+beanFactory);
   }

   @Override
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      System.out.println("applicationContext:"+applicationContext);
   }

   @Override
   public void afterPropertiesSet() throws Exception {
      System.out.println("InitializingBean");
   }
}