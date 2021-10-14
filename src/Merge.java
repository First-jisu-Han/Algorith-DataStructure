public class Merge {
	
	// 두개를 합병하는 메소드 
		private static void merge(Comparable[]a, Comparable[]b, int low, int mid , int high) {
			int i=low , j=mid+1;
			for(int k=low;k<=high;k++) {
				if (i>mid)  
					b[k]=a[j++];
				else if(j>high) 
					b[k]=a[i++];
				else if(isLess(a[j],a[i]))
					b[k]=a[j++];
				else   
					b[k]=a[i++];
			}
			
			for (int k=low;k<=high;k++) a[k]=b[k];	
		}
	// 각 나눠진 두부분을 각각 정렬시킴 
		private static void sort(Comparable[]a, Comparable [] b , int low, int high) {
			if(high<=low) return ; 
			
			int mid=low+(high-low) / 2; 
			// low 부터 mid까지가 앞부분 
			sort(a,b,low,mid);
			// mid+1 부터 high 까지가 뒷부분 
			sort(a,b,mid+1,high);
			// 병합하도록한다. 
			merge(a,b,low,mid,high);
		}
	// public으로 접근가능하게 
		public static void sort(Comparable []a ) {
			Comparable[]b=new Comparable[a.length];
			sort(a,b,0,a.length-1);
		}
		
		private static boolean isLess(Comparable v,Comparable w) {
			return (v.compareTo(w)<0);
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
			System.out.print("합병정렬: ");
			int i=0;
			while(i<a.length) {
				System.out.print(a[i]+ " ");
				i++;
			}
		}}
		

