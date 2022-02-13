import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String data = "11 22 33";

		//data의 값들을 배열을 이용하여 출력
		String[] arr = data.split(":"); //data의 문자열을 콜론을 기준으로 잘라 문자열 배열로 생성
		for (int i = 0 ; i < arr.length ; i++) 	{
			System.out.println(arr[i]);
		}
		
		StringTokenizer st = new StringTokenizer(data);
		while (st.hasMoreTokens()) 	{
			System.out.println(st.nextToken());
			//루프를 한번만 돌 수 있으며, 더 돌아야 한는 경우에는 새로 만들거나 배열에 담아서 사용해야 함
		}
		String str = "1+2-3*4/5";
		StringTokenizer st1 = new StringTokenizer(str,"+-*/");
		//구분자로 여러글자를 입력하면 각 글자별로 구분자로 취급됨
		while (st1.hasMoreTokens())	{
			System.out.print(st1.nextToken() + "  ");	// 1 2 3 4 5
		}
		String str = "1+2-3*4/5";
		StringTokenizer st2 = new StringTokenizer(str,"+-*/", true);
		//true : 구분자들도 토큰으로 취급하여 출력가능
		while (st2.hasMoreElements())	{
			System.out.print(st2.nextElement() + "  ");	// 1 2 3 4 5
		}
	}
}
