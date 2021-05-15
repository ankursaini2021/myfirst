class q9{
public static void main(String args[]){
	
	int a[]={05,06,85,36,15};
	
	int b[]=new int[5]; 
	System.out.println("array 1 is:  ");
	for(int i=0;i<5;i++){
		
			System.out.print(a[i]+"   ");
	}
		for(int i=0;i<5;i++){
		b[i]=a[i];
		}
		System.out.println();
	System.out.println(" copied array is :  ");
	
	for(int i=0;i<5;i++){
		
			System.out.print(b[i]+"   ");
	}
	
}

}