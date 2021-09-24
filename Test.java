import java.util.Scanner;

class Test{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Please insert any number");
  int num = sc.nextline();
  boolean isPrime = true;
  for(int i = 1; i<=num; i++){
  if(num%i==0){
  isPrime = false;
  }
  }
  if(isPrime){
  System.out.println(num+"is a Prime number");
  }else{
  System.out.println(num+"is not a Prime number");
  }
 
  
