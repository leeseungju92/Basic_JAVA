package problem;

public class TotalSumMethod {
	public void totalSum(int start, int end,) {
		//start~ end 까지 합 메서드
		int sum = 0;
		for(int i = start ; i<= end ; i++) {
			
			sum += i;
		}System.out.printf("%d ~ %d 합 : %d\n",start,end,sum+"%d ~ %d 합 : %d\n",start,end,sumE);
	}	
		//start ~ end 까지 짝수 합 메서드
	public void totalSumEven(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += ++i;
		}
		System.out.printf("%d ~ %d 짝수 합 : %d\n", start, end, sum);
	}

	public void totalSumOdds(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i++;
		}
		System.out.printf("%d ~ %d 홀수 합 : %d\n", start, end, sum);
	}

}
