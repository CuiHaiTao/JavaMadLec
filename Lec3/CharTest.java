class CharTest 
{
	public static void main(String[] args) 
	{
		//ֱ��ָ�������ַ���Ϊ�ַ�ֵ
		char aChar = 'a';
		//ʹ��ת���ַ���Ϊ�ַ�ֵʹ��
		char enterChar = '\r';
		//ʹ��Unicode����ֵ��ָ���ַ�ֵ
		char ch = '\u9999';
		//�����һ�����㡯�ַ�
		System.out.println(ch);
		//����һ�����衯�ַ�ֵ
		char zhong = '��';
		//ֱ�ӽ�һ��char��������int���ͱ���ʹ��
		int zhongValue = zhong;
		System.out.println(zhongValue);

		System.out.println("Hello World!");
		//ֱ�Ӱ�һ��0-65535��Χ�ڵ�int��������һ��char����
		char c = 97;
		System.out.println(c);
	}
}
