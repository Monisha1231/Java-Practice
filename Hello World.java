import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Starting number :");
     int sn =sc.nextInt();
     
       Scanner sc1=new Scanner(System.in);
      System.out.println("Enter the Ending number :");
     int en =sc1.nextInt();
     
     int count=0;
     
     for(int i=sn;i<=en;i++){
          if(i%1==0 && i%i==0 ){
              count++;
            System.out.println(i);  
          }
          else{
              continue;
          }
          
          
     }
     System.out.println(" Count :"+count);
     
     
    }
}