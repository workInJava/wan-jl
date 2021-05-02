package com.wan.jl.stream;

import java.io.*;
import java.lang.reflect.Method;

public class AppStream implements Serializable{


    private String name;


    public AppStream(String name) {
        this.name = name;
    }

    public static void main(String[] agrs) throws Exception {

        File[] files = new File("").listFiles(File::isHidden);
        fileStream();
        //objectStream();
        //byteArraysStream();
        //fileReader();
    }


    //FileInputStream
    public static void fileStream(){
        try(InputStream io = new BufferedInputStream(new FileInputStream("/Users/wanghuamin/Documents/repository/wan-jl/photo-album-service/src/main/java/com/wan/jl/stream/AppStream.java"));
            OutputStream out = new FileOutputStream("/Users/wanghuamin/Downloads/AppStream.java");
            OutputStream out1 = new FileOutputStream("/Users/wanghuamin/Downloads/AppStream1.java");){
            byte[] i = new byte[5];
            int len = 0;
            double total = 0.0;
            int size = io.available();
            System.out.println(io.markSupported());
           // io.mark(size);
            while((len=io.read(i))!=-1){
                System.out.println(len);
                total += len;
//                if(total==1024){
//                    io.mark(1000);
//
//                }
//                if(total==3019){
//                    io.reset();
//                }

                out.write(i);
                System.out.printf("\r已完成【%.2f%%】",total/size * 100);
            }



//
//            if(io.read(i)==-1){
//                io.reset();
//
////                Method m = io.getClass().getDeclaredMethod("open0", String.class);
////                m.setAccessible(true);
////                m.invoke(io,"/Users/wanghuamin/Documents/repository/wan-jl/photo-album-service/src/main/java/com/wan/jl/stream/AppStream.java");
//
//                while((len=io.read(i))!=-1){
//                    out1.write(i);
//                    total += len;
//                    System.out.printf("\r已完成【%.2f%%】",total/size * 100);
//                }
//            }


        }catch (Exception e){
            System.out.println(e);
        }
    }

    //ObjectInputStream
    public static void objectStream()throws Exception{
        String filePath = "/Users/wanghuamin/Downloads/test.txt";
        File file = new File(filePath);
        if(!file.exists()) file.createNewFile();
        try(
         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ) {

            out.writeObject(new AppStream("test"));
            //out.close();
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            AppStream appStream =(AppStream)o.readObject();

          //System.out.println(appStream.name);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    //ByteArrayInputStream
    public static void byteArraysStream(){

       try(ByteArrayOutputStream out = new ByteArrayOutputStream(2);
           ){
           byte[] buff = {'J',1,2};
           out.write(buff,1,2);
           for(byte be : out.toByteArray()){
               System.out.println(be);
           }

           ByteArrayInputStream input = new ByteArrayInputStream(buff);


       }catch (Exception e){

       }
    }

    //FileReader
    public static void fileReader(){
        try(//Reader br = new FileReader(new File("/Users/wanghuamin/Documents/repository/wan-jl/README.md"))
            Reader br = new InputStreamReader(System.in);){
            BufferedReader bf = new BufferedReader(br);
            String str = "";
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
//            int len = -1;
//            while((len=br.read())!=-1){
//                char c = (char)len;
//                System.out.print(c);
//            }

        }catch (Exception e){

        }
    }

    //BuffReader
//    public static void buffReader(){
//        try(){
//
//        }catch (Exception e){
//
//        }
//    }
}