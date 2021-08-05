package sr.unasat.BubbleSort;

public class BubbleSort 
{
	private long[] array; // refereert naar een array
	private int elementen; // aantal items
	
	public BubbleSort(int max){ // constructor
	array = new long[max]; // creëert de array
	elementen = 0; // 
	}
	
	public void insert(long value){ // zet element in array
	array[elementen] = value; // insert it
	elementen++; // increment de size
	}
	
	public void display() { // display de array contents
	
	for(int j=0; j<elementen; j++) // for each element,
	System.out.print(array[j] + " "); // display it
	System.out.println("");
	}

	public void bubbleSort(){ //start
	int out;
	int in;
	
	for(out=elementen-1; out>1; out--) // outer loop (backward)
		
	for(in=0; in<out; in++) // inner loop (forward)
		
	if( array[in] > array[in+1] ) // out of order?
	swap(in, in+1); // swap them
	} // end bubbleSort()
	
	private void swap(int one, int two){
		
	long temp = array[one];
	array[one] = array[two];
	array[two] = temp;
	
	}
	
	} 

