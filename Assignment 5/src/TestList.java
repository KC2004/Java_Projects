/**
 * 
 * @author kushlani
 * Creates 2 List objects of size 10 and 20. Prints the lists to see if list elements are 
 * created and initialized to zeros: then fill lists with random numbers and prints the lists 
 * out to check if working properly. 
 */
public class TestList{
	public static void main(String args[]){
		String printStr = "Should print a list of ";
		List zeroList = new List();
		System.out.println(printStr + "1 zero: " + zeroList);
		List myList = new List(10);
		System.out.println(printStr + "10 zeroes: " + myList);
		myList.fillWithRandom();
		System.out.println(printStr + "10 random numbers: " + myList);
		
		List secondList = new List(20);
		System.out.println(printStr + "20 zeroes: " + secondList);
		secondList.fillWithRandom();
		System.out.println(printStr + "20 random numbers: " + secondList);
		secondList.sort();
		System.out.println(printStr + "20 sorted random numbers: " + secondList);
		System.out.println("Should print the 2nd element in list" + secondList.getElement(2));

	}
}

/*
Should print a list of 1 zero: [0]
Should print a list of 10 zeroes: [0,0,0,0,0,0,0,0,0,0]
Should print a list of 10 random numbers: [2124796748,-1039575186,1086497949,2120635484,-1772664372,-430299589,-1954669976,-394984491,1843714635,2006561734]
Should print a list of 20 zeroes: [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
Should print a list of 20 random numbers: [-537174107,-1803081231,1236555321,-1024312759,325318269,-2073186122,382587283,328053330,-1026233276,-2077621056,-2027764338,1930555349,-1709793635,-262097586,583370534,-1343514392,1650932865,-181387890,696289020,1150849149]
Should print a list of 20 sorted random numbers: [-2077621056,-2073186122,-2027764338,-1803081231,-1709793635,-1343514392,-1026233276,-1024312759,-537174107,-262097586,-181387890,325318269,328053330,382587283,583370534,696289020,1150849149,1236555321,1650932865,1930555349]
Should print the 2nd element in list-2073186122

 */
