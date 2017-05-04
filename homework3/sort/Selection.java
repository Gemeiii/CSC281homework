package sort; 

public class Selection { 
  public static int ascending(int a[]) {
	int assignmentCounter=0;
    int n = a.length;
    for (int i = 0; i < n-1; i++) {
      int q = i;  
      for (int j = i+1; j < n; j++) {
        if (a[j] < a[q]) {
          q = j; 
        } 
      }
    int temp = a[i]; 
    a[i] = a[q]; 
    a[q] = temp;  
    assignmentCounter=assignmentCounter+3;
    } 
   return assignmentCounter; 
 } 
  
  public static int descending(int a[]) {
	  int assignmentCounter=0;
	    int n = a.length;
	    for (int i = 0; i < n-1; i++) {
	      int q = i;  
	      for (int j = i+1; j < n; j++) {
	        if (a[j] > a[q]) {
	          q = j; 
	        } 
	      }
	    int temp = a[i]; 
	    a[i] = a[q]; 
	    a[q] = temp; 
	    assignmentCounter=assignmentCounter+3;
	    } 
	   return assignmentCounter; 
	 } 
  
} 

//Group 1: Rebecca, Alex, Anna, Layla

