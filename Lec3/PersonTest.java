public class PersonTest
{
	public static void main(String[] argc)
	{
		Person p = new Person();
	//p.age = 1000;
	p.setAge(1000);
	System.out.println("δ����ʱage��Ա����ʱ��"+p.getAge());
	p.setAge(30);
	System.out.println("�ɹ�����age��Ա������"+p.getAge());
	p.setName("���");
	System.out.println("�ɹ�����age��Ա������"+p.getAge());
	}
	

}  
