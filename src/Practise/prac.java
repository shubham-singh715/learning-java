package Practise;
import java.util.ArrayList;
import java.util.Scanner;

public class prac{
    public static boolean sample(ArrayList<String> arr){
        if(arr.size()>4){
            return false;
        }
    for(int i=0;i<arr.size();i++){
        String s=arr.get(i);
        for(int j=0;j<s.length();j++){
            if(s.length()>3){
                return false;
            }
            else if(s.length()==1){
            if(s.charAt(j)<='0' && s.charAt(j)>='9'){
            return false;
            }
            }
            else if(s.length()==2){
                if(s.charAt(j)<='0' && s.charAt(j)>='9'){
                    return false;
                }else{
                     if(s.charAt(j+1)<='0' && s.charAt(j+1)>='9'){
                         return false;
                     }
                }
            } 
            else if(s.length()==3){
                 if(s.charAt(j)>='0' && s.charAt(j)<='1'){
                   if(s.charAt(j+1)<='0' && s.charAt(j+1)>='9'){
                       return false;
                   }else{
                       if(s.charAt(j+2)<='0' && s.charAt(j+2)>='9'){
                           return false;
                       }
                   }
                }else if(s.charAt(j)>='1' && s.charAt(j)<='2'){
                    
                        if(s.charAt(j+1)<='0' && s.charAt(j+1)>='5'){
                       return false;
                   }else{
                       if(s.charAt(j+2)<='0' && s.charAt(j+2)>='5'){
                           return false;
                       }
                   }
                    
                    
            }else{
                return false;
            } 
        }
    }
    }
    return true;
}



     
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
           String str=sc.nextLine(); 
           
     
       ArrayList<String> arr= new ArrayList<>();
       String s="";
       
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)!='.'){
               s+=str.charAt(i);
           }
           else{
               arr.add(s);
               s="";
           }
       }
      
       System.out.println(sample(arr));
    }
}
 
