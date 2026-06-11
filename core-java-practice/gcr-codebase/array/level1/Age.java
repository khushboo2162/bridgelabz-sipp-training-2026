import java.util.Scanner;

public class Age{

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		int arr[]= new int[n];
		 for(int i=0;i<n;i++){
		 arr[i]=sc.nextInt();}
		 for(int i=0;i<n;i++){
		 if(arr[i]>18){
		  System.out.println("can vote");}
		  else if(arr[i]<18){
		  System.out.println("cannot  vote");}
		 else{
System.out.println("invalid ");}}}}
