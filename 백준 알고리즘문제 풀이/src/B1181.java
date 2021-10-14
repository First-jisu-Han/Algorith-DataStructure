import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner; 
public class B1181 {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		
		int number = scanner.nextInt();   
		String[] letters= new String [number] ; 
		
		scanner.nextLine();    // nextInt() 다음에 문자 입력하면 그 해당 숫자까지 카운트 됨. 
		
		for(int i=0;i<number;i++) {
			
			letters[i]= scanner.nextLine(); 
			
		}
		Arrays.sort(letters,new Comparator<String>(){
			
			public int compare(String letter1, String letter2) {
				if(letter1.length()==letter2.length()) {
					return letter1.compareTo(letter2);
				}
				else {
					return letter1.length() - letter2.length() ;
				}
			}
		});
		System.out.println(letters[0]);
		for(int j=1;j<number;j++) {
			if(!letters[j].equals(letters[j-1])) {
				System.out.println(letters[j]);
			}
		
		}
		
		
	}
	
	

}