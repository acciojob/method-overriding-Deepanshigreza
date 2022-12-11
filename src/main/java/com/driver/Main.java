package com.driver;

abstract class A {
    public static String meth(){
        return "hello";
    }


}
class B extends A{

    public static String meth(){
        return "Method is overridden in Extended class B";
    }

}
public class Main {
    public static void main(String[] args){
        A obj1=new B();
        B obj2=new B();
  System.out.println(obj2.meth());
}}