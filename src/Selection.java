public class Selection {
	
	// 배열 a 의 타입이 Comparable 타입 
	public static void sort(Comparable[]a) {
		int N=a.length;
		// 바깥 for 문은  전체 배열을 순회 
		for(int i=N-1;i>=0;i--) {
			int max=i;
			// unsorted 영역 
			for(int j=i-1;j>=0;j--) {
				// 순회하면서 최대값을 찾는다.
				if(isLarge(a[j],a[max])) 
					max=j;
			}
			swap(a,i,max);
		}
		
	}
	
	// 배열의 원소 
	// i가 j보다 크면 true , i가 j보다 작으면 false 를 리턴한다. 
	private static boolean isLarge(Comparable i,Comparable j) {
		return (i.compareTo(j)>0);
	}
	
	
	private static void swap(Comparable[]a,int i,int j) {
		Comparable temp=a[i]; 
		a[i]=a[j]; 
		a[j]=temp; 
	}
	
	public static void print(Comparable[] a) {
		System.out.print("선택정렬 : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	
	
	// Selection Sort 사용 메서드 
	
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
		print(a);
		
	
	}
}