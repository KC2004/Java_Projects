import java.util.Random;
/*import java.util.ArrayList;*/
/**
 * 
 * @author kushlani
 * One object of this class holds a list of integers 
 */
public class List {
	
	private int[] list;
	
	/**
	 * constructor. creates one element list
	 */
	public List(){
		list = new int[1];
	}
	
	/**
	 * constructor with listSize as a parameter: 
	 * creates a list of integers with length listSize
	 */
	public List(int listSize){
		list = new int[listSize];
	}
	
	/**
	 * returns a string with all values of list, comma separated.
	 */
	public String toString(){
		String strList = "["; 
		for (int i=0; i<list.length; i++){
			strList += list[i];
			if (i != list.length-1){
				strList += ",";
			}
			else{
				strList += "]";
			}
		}
		return strList;
	}
	
	/**
	 * fill list with random numbers
	 */
	public void fillWithRandom(){
		Random rand = new Random();
		for (int i=0; i<list.length; i++){
			list[i] = rand.nextInt();
		}
		
	}
	
	/**
	 * sort list in ascending order (bubble sort)
	 */
	public void sort(){	
		int count = 0;
		while (count < list.length){
			for(int i=0; i < (list.length-1-count); i++){ // -count: as largest will be sorted in first round etc.
				if (list[i] > list[i+1]){
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}				
			count++;
		}
	}
	
	/**
	 * returns the nth element in the list
	 */
	public int getElement(int nth){
		return list[nth - 1];
	}
}
