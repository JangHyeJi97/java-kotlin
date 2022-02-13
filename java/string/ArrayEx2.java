class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5, 6};
		// 배열은 선언 및 생성과 동시에 초기화 시킬 수 있음

		// arrInt 배열을 역순으로 출력(가로로)
		for (int i = arrInt.length - 1 ; i >= 0 ; i--) {
			System.out.print(arrInt[i] + "  ");
		}	// 6  5  4  3  2  1

		System.out.println();

		// arrInt 배열을 2, 4, 6 으로 출력(가로로)
		for (int i = 1 ; i < arrInt.length ; i += 2) {
			System.out.print(arrInt[i] + "  ");
		}	// 2  4  6
	}
}
