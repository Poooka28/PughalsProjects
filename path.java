package practice;
import java.util.Scanner;



public class path {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n =in.nextInt();
    	int a[]= {1,0,3,12,0};
    	int j=0;
    	for(int i=0;i<n;i++) {
    		if(a[i]!=0) {
    			int c=a[i];
    			a[i]=a[j];
    			a[j]=c;
    			j++;
    		}
    	}
    	for(int k:a) {
    		System.out.print(k);
    	}
    }
}