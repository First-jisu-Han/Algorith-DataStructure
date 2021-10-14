public class Shell {
	public static void sort(Comparable[]a) {
		int N=a.length;
		int h=4; 
		while(h<=1) {
			for (int i=h;i<N;i++) {
				for(int j=i;j>=h && isLess(a[j],a[j-h]);j-=h) {
					swap(a,i,j);
				}
			}
			h/=3; 
		}
	}
	// 배열의 원소 
	// i가 j보다 작으면 true , i가 j보다 크면 false 를 리턴한다. 
	private static boolean isLess(Comparable i,Comparable j) {
		return (i.compareTo(j)<0);
	}
	
	private static void swap(Comparable[]a,int i,int j) {
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String args[]) {
		Comparable[] a= new Comparable[12];
		a[0]=65;
		a[1]=95;
		a[2]=90; 
		a[3]=80;
		a[4]=55;
		a[5]=70;
		a[6]=35; 
		a[7]=50;
		a[8]=10;
		a[9]=25;
		a[10]=40; 
		a[11]=30;
		sort(a);
		System.out.print("쉘정렬 : ");
		int i=0;
		while(i<a.length) {
			System.out.print(a[i]+ " ");
			i++;
		}
	}
		

}