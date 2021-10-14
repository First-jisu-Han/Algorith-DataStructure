public class Bubble {

	public static void sort(Comparable[]a) {
		int N=a.length;
		for(int i=0 ;i<N;i++) {
			for(int j=1;j<N-i;j++) {
				if(isLarger(a[j-1],a[j])){
					swap(a,j-1,j);
			}
		}
			
	}
	}
	// 첫 parameter가 두번째 parameter 보다 크면 true 
	public static boolean isLarger(Comparable i, Comparable j) {
		return (i.compareTo(j)>0);
		
	}

	// 서로 바꾸는 메서드 정의 
	public static void swap(Comparable[] a,int i,int j) {
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
		
	public static void print(Comparable[] a) {
		System.out.print("버블정렬 : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
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
		print(a);
		
	}

}