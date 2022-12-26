package searching;

public class SearchingMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<------------Inside the Searching Main-------->");
		int[] array = {11,12,23,14,1,4};
		
		Searching search = new Searching(array,array.length);
//		int result= search.linearSearch(1,array.length ,1);
//		int result= search.linearSearch(1 ,1);
		int result= search.linearSearch(1);
		System.out.print(result);

	}

}
