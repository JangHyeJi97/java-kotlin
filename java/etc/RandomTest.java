import java.util.*;

class RandomTest {
	public static void main(String[] args) 	{
		//1~10사이의 정수들 중에서 3개를 무작위로 추출하여 출력 : 단, 홀수가 짝수보다 두 배 높은 확률로 나와야함
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 3, 5, 7, 9};
		Random rnd = new Random();
		for (int i = 0 ; i < 3 ; i++ )	{
			System.out.print(arr[rnd.nextInt(15)] + " ");
		}
	}
}
