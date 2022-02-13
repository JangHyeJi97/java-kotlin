class RuntimeExceptionCase {
	public static void main(String[] args) 	{
		try	{
			int[] arr = new int[3];
			arr[-1] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		try	{
			Object obj = new int[10];
			String str = (String)obj;
		} catch (ClassCastException e) {
		//형변환이 불가능한 객체를 형변환 시킬때 발생하는 예외
			System.out.println(e.getMessage());
		}
		try	{
			int[] arr = new int[-10];
		} catch (NegativeArraySizeException e) {
		//배열의 크기를 음수로 입력했을 경우 발생하는 예외
			System.out.println(e.getMessage());
		}
		try {
			String str = null;
			int len = str.length();
		} catch (NullPointerException e) {
		//객체가 비어있는지 모르고 객체를 사용하고자 할 때 발생하는 예외!!!!!
			System.out.println(e.getMessage());
		}
	}
}
