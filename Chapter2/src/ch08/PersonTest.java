package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.name = "Tomas";
		person.age = 37;
		person.gender  = "남성";
		person.height = 180;
		person.weight = 78;
		
		System.out.println(person.showPersonInfo());
	}

}
