/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification.system;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class notificationProperities {

    String type;
    ArrayList<String>Language=new ArrayList<>();
    ArrayList<String>templete=new ArrayList<>();
    

    public notificationProperities() {
        
    }
    

    public void setTemplete(String templete) {
        this.templete.add(templete);
    }
    
   public String getTemplete(String Language) {
       
        for(int i=0;i<this.Language.size();i++){
         if(this.Language.get(i).equals(Language)){
            return templete.get(i);
      }

       }
        return null;
   }
   
   public ArrayList<String> getTemplete() {
   return this.templete;
   }

    public void setLanguage(String Language) {
        this.Language.add(Language);
    }
   
   public ArrayList<String> getLanguage(){
   return this.Language;
   }
   
     public boolean existLanguage(String Language) {
         
        for(int i=0;i<this.Language.size();i++){
       if(this.Language.get(i).equals(Language)){
           return true;
     }
 
     }    
      return false;
     }
     
     
    public void setType(String type) {
        this.type = type;
    }
    
     public String getType() {
      return type;
    }

     
  public  void replaceTemplate(String language ,String newTemplate){
  
 int index= this.Language.indexOf(language);
 templete.set(index, newTemplate);
  
  
  }
    
}
