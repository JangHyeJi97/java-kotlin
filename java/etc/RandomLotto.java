import java.util.*;

class  RandomLotto {
	public static void main(String[] args) 	{
		// 로또번호 생성기 : 1~45까지의 정수 6개가 중복되지 않고 출력
		int[] arrLotto = new int[6];
		Random rnd = new Random();

		for (int i = 0 ; i < arrLotto.length ; i++) {
			arrLotto[i] = rnd.nextInt(45) + 1;	//1~45사이의 정수를 임의적으로 받아옴
			for (int j = 0 ; j < i ; j++ ) {
			//현재 받은 값보다 작은 인덱스ㅡㄹ 가진 배열의 값들을 루프룰 돌면서 비교함
				if (arrLotto[i] == arrLotto[j]) {
				// arrLotto배열에 저장된 기존 값들 중에서 현재 받은 값과 동일한 값이 있으면
					i--;	break;
					//동일한 값은 다시 받아야 하므로 인덱스로 사용될 i의 값을 다시 1감소시킨 후 안쪽 for문을 빠져나감
				}
			}
		}
		for (int i = 0 ; i < arrLotto.length ; i++ ) {
			System.out.print(arrLotto[i] + "  ");
		}
	}
}
