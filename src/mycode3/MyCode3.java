/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode3;

/**
 *
 * @author LENOVO
 */
public class MyCode3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
StringBuilder sb=new StringBuilder("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb); 
sb.delete(1,3);  
System.out.println(sb);
sb.reverse();  
System.out.println(sb);
System.out.println(sb.capacity());
sb.append("Hello");  
System.out.println(sb.capacity());  
sb.append("java is my");  
System.out.println(sb.capacity());
sb.replace(1,3,"Java");  
System.out.println(sb);
}  
    }
    

