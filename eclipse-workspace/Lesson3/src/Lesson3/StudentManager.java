package Lesson3;

public class StudentManager {
	public void addComment(User user,String mesaj) {
		System.out.println(user.getFirstName() + " adlı kullanıcın yorumu : " +  mesaj);
	}
}
