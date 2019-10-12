package com.wan.jl;

<<<<<<< Updated upstream
=======
import sun.net.www.http.HttpClient;

>>>>>>> Stashed changes
public class TestMain {

    public static void main(String[] args) throws Exception{

<<<<<<< Updated upstream
        Thread t = new Thread(()->{
           try {
               Thread.sleep(2000l);

           }catch (Exception e){

           }
            System.out.println(Thread.currentThread().getName()+" end!");
        });

        t.start();

        t.join();

        System.out.println("============");
=======

//        Thread t = new Thread(()->{
//           try {
//               Thread.sleep(2000l);
//
//           }catch (Exception e){
//
//           }
//            System.out.println(Thread.currentThread().getName()+" end!");
//        });
//
//        t.start();
//
//        t.join();
//
//        System.out.println("============");
>>>>>>> Stashed changes


    }
}
