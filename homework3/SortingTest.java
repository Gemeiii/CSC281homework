import sort.*;
public class SortingTest {
	public static void main(String[] args) {
		System.out.println("Let the tests begin!");
		SortingTest sortingTest = new SortingTest();
		
		sortingTest.testAllSorters();
	//	int[][] x =sortingTest.getRandomArrays(3, 10);
	//	System.out.println(x[1].length);

	}

	/**
	 * 
	 * @param arrayLength  the length of the random array;
	 * @return a random array;
	 */
	public int[][] getRandomArrays(int arraysNumber,int arrayLength) {
		int[][] arrayTemp = new int[arraysNumber][arrayLength];
		for (int i = 0; i < arrayTemp.length; i++) {
			for(int j = 0;j<arrayTemp[i].length;j++){
				arrayTemp[i][j] = (int) (1000 * Math.random());
			}
		}
		return arrayTemp;
	}

	public void testAllSorters() {
		System.out.println("Bubble Ascending: ");
		testBubbleAscending();

		System.out.println("Bubble Descending: ");
		testBubbleDescending();

		System.out.println("Selection Ascending: ");
		testSelectionAscending();

		System.out.println("Selection Descending: ");
		testSelectionDescending();

		System.out.println("Insertion Ascending: ");
		testInsertionAscending();

		System.out.println("Insertion Descending: ");
		testInsertionDescending();
		
	}

	private void testBubbleAscending() {
		long timeTemp ;
		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Bubble.Ascending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs ");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
		
		
	}

	private void testBubbleDescending() {
		long timeTemp ;
		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Bubble.Descending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs of bubble sort ascending for each case");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
		

	}

	private void testSelectionAscending() {
		long timeTemp ;		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Selection.ascending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs of bubble sort ascending for each case");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
	}

	private void testSelectionDescending() {
		long timeTemp ;		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Selection.descending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs of bubble sort ascending for each case");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
	}

	private void testInsertionAscending() {
		long timeTemp ;		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Insertion.ascending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs of bubble sort ascending for each case");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
	}

	private void testInsertionDescending() {
		long timeTemp ;		
		int counts10 = 0;
		long time10 =0;
		int[][] testArrays = getRandomArrays(10,10);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays.length;i++){
			int counts  = Insertion.descending(testArrays[i]);
			counts10 = counts10+counts;
		}
		time10 = System.currentTimeMillis()-timeTemp;
		float averageCounts10=(float)(counts10) / 10.0f;
		double averagetime10 =(time10)/10.0;
		System.out.println("Average assignments and time in 10 runs of bubble sort ascending for each case");
		System.out.println("length : 10"+"    assignments:"+averageCounts10+"    time:"+averagetime10);
		
		int counts100 = 0;
		long time100 =0;
		int[][] testArrays100 = getRandomArrays(10,100);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays100.length;i++){
			int counts  = Bubble.Ascending(testArrays100[i]);
			counts100 = counts100+counts;
		}
		time100 = System.currentTimeMillis()-timeTemp;

		float averageCounts100=(float)(counts100) / 10.0f;
		double averagetime100 =(time100)/10.0;
		System.out.println("length : 100"+"    assignments:"+averageCounts100+"    time:"+averagetime100);
		
		int counts1000 = 0;
		long time1000 =0;
		int[][] testArrays1000 = getRandomArrays(10,1000);
		timeTemp = System.currentTimeMillis();
		for(int i=0;i<testArrays1000.length;i++){
			int counts  = Bubble.Ascending(testArrays1000[i]);
			counts1000 = counts1000+counts;
		}
		time1000 = System.currentTimeMillis()-timeTemp;
		float averageCounts1000=(float)(counts1000) / 10.0f;
		double averagetime1000 =(time1000)/10.0;
		System.out.println("length : 1000"+"    assignments:"+averageCounts1000+"    time:"+averagetime1000);
		System.out.println("( ^_^).=================================.(^_^ )");
		System.out.println("");
	}

}
