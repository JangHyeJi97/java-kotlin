class StringEx3 {
	public static void main(String[] args) 	{
		String str1 = "test@abc.com";	String str2 = "testabc.com";
		String str3 = "test@abccom";	String str4 = "test.abc@com";

		isEmail(str1);	isEmail(str2);	isEmail(str3);	isEmail(str4);
		
	}
	public static void isEmail(String email) {
	/* �޾ƿ� email�� �˻��Ͽ� �̸��� �ּҰ� �´��� ���
	1. �ݵ�� '@'�� �־�� �� : indexOf()�� -1�� �ƴ��� ����
	2. �ݵ�� '.'�� �־�� �� : indexOf()�� -1�� �ƴ��� ����
	3. �ݵ�� '@'�� '.'���� �տ� �־�� �� : indexOf()�� ��ġ�� ��
	*/	
		int at = email.indexOf('@');	//email���� @�� ��ġ �ε���
		int dot = email.indexOf('.');	//emial���� .�� ��ġ �ε���

		if(at == -1) {
			System.out.println(email + "��(��) �̸��� �ּҰ� �ƴմϴ�.");	
		} else if(dot == -1)	{
			System.out.println(email + "��(��) �̸��� �ּҰ� �ƴմϴ�.");	
		} else if(at > dot) {
			System.out.println(email + "��(��) �̸��� �ּҰ� �ƴմϴ�.");	
		} else {System.out.println(email + "��(��) �̸��� �ּҰ� �½��ϴ�.");			
			
		}

	//String ext = email.substring('@' + 1);	//file ���ڿ��� ������ ���� ��ġ ���� ���ں��� ������ �߶��
	//double dot = email.lastIndexOf('.');		//file���ڿ����� ������ ���� ��ġ�� dot�� ����
	

		/*if (str1.equals(str1))	System.out.println(str1 + "��(��) �̸��� �ּҰ� �½��ϴ�.");	
		else							System.out.println(str1 + "��(��) �̸��� �ּҰ� �ƴմϴ�.");
		if (str2.equals(str2))	System.out.println(str2 + "��(��) �̸��� �ּҰ� �½��ϴ�.");	
		else							System.out.println(str2 + "��(��) �̸��� �ּҰ� �ƴմϴ�.");
		if (str3.equals(str3))	System.out.println(str3 + "��(��) �̸��� �ּҰ� �½��ϴ�.");	
		else							System.out.println(str3 + "��(��) �̸��� �ּҰ� �ƴմϴ�.");
		if (str4.equals(str4))	System.out.println(str4 + "��(��) �̸��� �ּҰ� �½��ϴ�.");	
		else							System.out.println(str4 + "��(��) �̸��� �ּҰ� �ƴմϴ�.");
*/
		
	//if(ext.equals("test@abc.com") || ext.equals("testabc.com") || ext.equals("test@abccom") || ext.equals("test.abc@com")){
			//System.out.println(email + "��(��) �̸��� �ּҰ� �½��ϴ�.");			
		//} else {
			//System.out.println(email + "��(��) �̸��� �ּҰ� �ƴմϴ�.");	
		//}
	}

}
