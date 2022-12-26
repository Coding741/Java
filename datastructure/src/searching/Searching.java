package searching;
//import java.util.Arrays;

public class Searching {
	private int[] intputArray;
	private int size;
	public Searching(int[] intputArray, int size) {
		this.intputArray = intputArray;
		this.size = size;
	}
	/*
	 	linearSerach method 
	 	 Input 
	 	 
	 	 @from : contain starting index of where to search the element
	 	 @to   : contain end index of where we stop the searching
	 	 @element : searching element in Array 
	 	 Output
 	 	 
 	 	 @return  : 
 	 			if element find then return the index 
 	 			otherwise return -1;
	 */
	public int  linearSearch(int from,int to ,int element) {
		if(from<0) {
			System.out.println(from+"is less then 0");
			return -1;
		}
		if(to<0) {
			System.out.println(to+"is less then 0");
			return -1;
		}
		if(from>size) {
			System.out.println(from+"is larger then array Size"+size);
			return -1;
		}
		if(to>size) {
			System.out.println(to+"is larger then array Size"+size);
			return -1;
		}
		if(from>to) {
			System.out.println(from+"is larger then to"+to);
			return -1;
		}
		if(from==to) {
			return intputArray[from]==element?from:-1;
		}else {			
			for(int i=from;i<to;i++) {
				if(intputArray[i]==element) {
					return i;
				}
			}
		}
		return -1;
	}
	/*

 	linearSerach method
 	 Input
 	 @from : contain starting index of where to search the element
 	 @element : searching element in Array 
 	 Output
 	 @return  : 
 	 			if element find then return the index 
 	 			otherwise return -1;
 */
	public int  linearSearch(int from ,int element) {
		if(from<0) {
			System.out.println(from+"is less then 0");
			return -1;
		}
	
		if(from>size) {
			System.out.println(from+"is larger then array Size"+size);
			return -1;
		}			
		for(int i=from;i<size;i++) {
			if(intputArray[i]==element) {
				return i;
			}
		}
		
		return -1;
	}
	/*
 	linearSerach method
 	 Input
 	 @from : contain starting index of where to search the element
 	 Output
 	 @return  : 
 	 			if element find then return the index 
 	 			otherwise return -1;
 */
	public int  linearSearch(int element) {
		for(int i=0;i<size;i++) {
			if(intputArray[i]==element) {
				return i;
			}
		}
		
		return -1;
	}
	
	

}
