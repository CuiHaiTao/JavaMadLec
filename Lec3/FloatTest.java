class FloatTest 
{
	public static void main(String[] args) 
	{
		float af = 5.2345556f;
		//���潫����af��ֵ�Ѿ������˱仯
		System.out.println(af);
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		//����float �� double�ĸ����������ȵ�
		System.out.println(c==d);
		//0.0 ���� 0.0�����ַ���
		System.out.println(a/a);
		//��������֮���ǲ���ȵ�
		System.out.println(a/a == Float.NaN);
		//���������������ȵ�
		System.out.println(6.0 / 0 == 505.0 / 0);
		//��������0.0�õ��������
		System.out.println(-8/a);
		//����Ĵ��뽫�׳�����0���쳣
		//System.out.println(0/0);
	}
}