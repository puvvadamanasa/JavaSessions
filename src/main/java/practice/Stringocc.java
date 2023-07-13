package practice;



public class Stringocc {

	public static void main(String[] args) {
		int[] a = {200,700,300,500,100,99};//55,
		int temp;
		int len = a.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
			System.out.println(a[len-2]);
		
	
	}

}
