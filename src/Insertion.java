public class Insertion {
	public static void sort(Comparable[]a) {
		int N=a.length;
		for(int i=1;i<N;i++) {
			// 앞에서 이미 다 정렬이 되니깐 중간에 정렬이 맞으면 도중에 break해도 문제가 없는것 
			for(int j=i;j>0;j--) {
				if(isLess(a[j],a[j-1]))
					swap(a,j,j-1);
				else break; 
			}
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
		System.out.print("삽입정렬: ");
		int i=0;
		while(i<a.length) {
			System.out.print(a[i]+ " ");
			i++;
		}
		
		
		
	}

}
