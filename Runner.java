public class Runner
{
	public static void main(String[] args)
	{
		MyHasher test = new MyHasher();
		System.out.println(test.hash(new Object()));
		System.out.println(test.hash(new Object()));
	}
}