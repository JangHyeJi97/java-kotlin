class BufferBuiler {
	public static void main(String[] args) 	{
		String str = "AB"; //String�� �ν��Ͻ� str1�� ����
		StringBuilder sb = new StringBuilder //String�� �ν��Ͻ� str1�� ����
		System.out.println(sb); // AB

		sb.append(25);					System.out.println(sb); // AB25
		sb.append('Y').append(true);	System.out.println(sb); // AB25true

		sb.insert(2,false);				System.out.println(sb); // AB25
		sb.insetr(sb.length(), 'z');						System.out.println(sb); // AB25true


		sb.delete(3,6);		System.out.println(sb); // AB25true
		sb.deleteCharAt(5);		System.out.println(sb); // AB25true

		
		sb.setCharAt(3,'K');		System.out.println(sb); // AB25true
		sb.reverse();		System.out.println(sb); // AB25true

	
			String str2 = new String(sb);
			//���ڿ� ������ ���� StringBuilder�� �ν��Ͻ� sb�� String �ν��Ͻ��� ����
			System.out.println(sb); // 
	}
}
