import java.util.Scanner;

public class Height{

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		 double arr[]= new double[n];
		 for(int i=0;i<n;i++){
		 arr[i]=sc.nextDouble();}
		   double sum=0;
		  for(int i=0; i<n;i++){
		  sum=sum+arr[i];
		  }
		    double mean = sum/n;
		   System.out.println(mean);
		  
		 }}