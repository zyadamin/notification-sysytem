/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification.system;

import java.util.ArrayList;

/**
 *
 * @author zezo
 */
public class NotificationSystem {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       
 NotificationTemplates x =new NotificationTemplates();
 
 x.create("confirmation","Hello (*) To confirm your email address, click the link below\n" +
"https://ask.fm/*/confirm-email/qadoiijzj6cabjz1soxe6xidpohczec ","english");  
  x.create("confirmation","مرحبا لكي يتم تاكيد عنوان البريد الالكتروني اضغط علي اللينك ف الاسفل \n"+"https://ask.fm/*/confirm-email/qadoiijzj6cabjz1soxe6xidpohczec ","arabic");
  x.create("forgetten password","Please use the following password to access your account:WQgJSNumvq","english");
  x.create("forgetten password","رجاءا استخدم كلمه المرور التاليه لاعاده حسابك :WQgJSNumvq","arabic");
  x.create("Booking","Dear {x} , your booking of the {y} is confirmed. thanks for using our store ","english");
  x.create("Booking","عزيزي العميل  يتم تأكيد حجز المنتج شكرا لاستخدامك موقعنا","arabic");
 x.readAll("forgetten password");
  x.readAll("Booking");
  x.readAll("confirmation");
  x.update("Booking"," عزيزناالعميل  يتم تأكيد حجز المنتج شكرا لاستخدامك موقعنا", "arabic");
  System.out.println(x.read("Booking","arabic"));
  x.delete("forgetten password");
  x.readAll("forgetten password");

    }
    
}
