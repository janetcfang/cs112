public class UserNameDriver{
	
	public static void main(String[] args){

		Name2 n1 = new Name2("Bob", "Smith", 'J');

		UserNameGenerator gen = new UserNameGenerator();
		String userName = gen.generateUserName(n1);

		System.out.println(userName);

	}

	
}
