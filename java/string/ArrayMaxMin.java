import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + 1 + "��° ���� : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("�ּҰ� : " + minValue(arr));
		System.out.println("�ִ밪 : " + maxValue(arr));
	}
	public static int minValue(int[] arr) {
	// �޾ƿ� �迭���� �ּҰ��� ���Ͽ� �����ϴ� �޼ҵ�
		int min = arr[0];	//arr�迭�� ù���� ���� �����Ͽ� �ٸ� ����� ���ϸ鼭 �۾��� ��
		for (int i = 1 ; i < arr.length ; i++ ) {
			if (min > arr[i])	min = arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) {
	// �޾ƿ� �迭���� �ִ밪�� ���Ͽ� �����ϴ� �޼ҵ�
	}
}
