import java.util.*;

public class Reverse_string{

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 char s[]= new char[n];
		  for(int i=0; i<n;i++){
			  s[i]= sc.next().charAt(0);
		  }
		int start=0;
		int last = s.length-1;
		while(start<last){
		   char temp = s[start];
		   s[start] = s[last];
		   s[last]= temp;
		   start++;
		   last--;
		   }
		   for(int i =0 ;i< s.length;i++){
		   System.out.println(s[i]);
		   }
		}}