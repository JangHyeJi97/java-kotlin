/*
���ο� ���� ������ ������ �� �ִ� Ract Ŭ���� ����
1. �ν��Ͻ� ������ ���ÿ� ����������� �ʱ�ȭ ��Ŵ
2. ���ο� ���� ������ ������ ���ִ� �޼ҵ� ����
3. ���簢���� ���̿� �ѷ��� ����ؼ� �����ϴ� �޼ҵ� ����
	- ���� 12, ���� 17�� ���簢�� �ν��Ͻ� ���� �� ���� ���
	- ���θ� 9, ���θ� 7�� ������ �� �ѷ� ���
	*/

class Rect{
	private int width, height;
	public Rect(int w, int h) {//������
		width = w; height = h;
	//�����ڿ��� �ʱ�ȭ�ϹǷ� �ν��Ͻ� ������ ���ÿ� �ʱ�ȭ�� ��
	}
	public void setWidth(int w) {width = w;}
	public void setHeight(int h) {height = h;}
	public int getArea() {return width * height;}
	public int getPeri() {return (width + height) * 2;}
}


class RactMain {
	public static void main(String[] args) 	{
		Rect rect = new Rect(12, 17); // ���� 12, ���� 17�� ���簢�� �ν��Ͻ� ����
		System.out.println("���� : " + rect.getArea());

		rect.setWidth(9);		rect.setHeight(7);
		//���θ� 9, ���θ� 7�� ����
		System.out.println("�ѷ� : " + rect.getPeri());

	}
}
