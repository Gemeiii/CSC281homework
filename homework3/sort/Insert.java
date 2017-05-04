package sort;

public class Insert{
  public static void main(String[] args){
    int b = 7;
    int[] a2 = {5,3,4,9,6};

    int[]  a = new int[a2.length+1];
    for(int i = 0;i<a.length-1;i++){
        a[i] = a2[i];
    }
    a[a.length-1] = b;

    a = ascending(a);
//    System.out.println(a);
    for(int i =0;i<a.length;i++){
      System.out.print(a[i]+"");
    }
  }
   public static int[] ascending(int[] array){
     int i, j, newValue;
      for (i = 1; i < array.length; i++) {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue) {
                  array[j] = array[j - 1];
                  j--;
            }
            array[j] = newValue;
      }
      return array;
      
}
}
