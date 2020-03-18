package main.java.Test;


public class JavaProgram {
	
	public static void main(String args[]) {
		
		int[] ar = {564,120,478,1235,41,2,568,102,365,185,210};
		
		
		
		int k = 0;
		for (int j=1;j<ar.length; j++) {
		for (int i=0;i<ar.length; i++) {
			if(ar[j]>ar[i]) {
				k= ar[i];
				ar[i]= ar[j];
				ar[j]=k;
				
				
			}
		}	
		}
		
		System.out.println("The 5th highest element is : "+ar[4]);
		
	}

}
