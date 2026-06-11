import java.util.Scanner;

public class Twodarray{

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int row  =sc.nextInt();
		int col= sc.nextInt();
		int arr[][]= new int[row][col];
		int a1[]= new int [row*col];
		int k =0;
		for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
		    arr[i][j]=sc.nextInt();
			a1[k]= arr[i][j];
			k++;
		}}
		 for(int i=0;i<a1.length;i++){
		   System.out.print( a1[i]+" ");}}}