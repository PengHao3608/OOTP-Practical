 import java.util.Scanner;
public class Pratical1Q3 {
  

    public static void main(String[] args) {
      String creditNo="";
      int sum1=0;
      int sum2=0;
      
      Scanner scan =new Scanner(System.in);
      
      System.out.print("Enter 8-digit card number:");
      creditNo=scan.next();
      
      for(int i=7;i>=0;i-=2){
          sum1+=creditNo.charAt(i)-'0';
      }
  
      for(int i=6;i>=0;i-=2){
          int temp=creditNo.charAt(i)-'0';
          
          int doubling=temp*2;
          if(doubling>=10){
          int q= doubling/10;
          int r= doubling%10;
           sum2+=q+r;
          }else{
            sum2+=doubling;
          }
      }

      if( (sum1+sum2)%10!=0 ){
          System.out.print("Your card is not valid\n");
      }
      else{
          System.out.print("Your card is valid.Thank You\n");
      }
           
                
    }

}


