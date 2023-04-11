package ch08;

public class Person {
	
	String name;
	int age;
	int height;
	int weight;
	String gender;
	
	public String showPersonInfo() {
		
		return "키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.";
	}

}
