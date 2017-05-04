package sort;

public class Insertion{
  
  public static int descending(int[] array){
	

	int assignmentCounter =0;
	
    int itemsSorted;
    int currentNum;
    int i;  
    
    for (itemsSorted = 1; itemsSorted < array.length; itemsSorted++){  //iterate through array
      currentNum = array[itemsSorted]; //sets the number we are sorting with next index

      assignmentCounter++;
      for(i = itemsSorted - 1; (i >= 0) && (array[i] < currentNum); i--){
        array[ i+1 ] = array[i];
        assignmentCounter++;
      }
    array[ i+1 ] = currentNum;

    assignmentCounter++;
    }
 
    return assignmentCounter;
  }

public static int ascending(int[] array){
	int assignmentCounter =0;
	
  int i, j, newValue;
  for (i = 1; i < array.length; i++) {
    newValue = array[i];
    assignmentCounter++;
    j = i;
    while (j > 0 && array[j - 1] > newValue) {
      array[j] = array[j - 1];
      assignmentCounter++;
      j--;
    }
    array[j] = newValue;
    assignmentCounter++;
  }
  return assignmentCounter;

}
}
