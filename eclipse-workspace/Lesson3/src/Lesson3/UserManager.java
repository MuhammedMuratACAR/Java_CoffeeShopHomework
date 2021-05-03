package Lesson3;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " adlı Kullanıcı Giriş Yaptı.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " adlı Kullanıcı Çıkış Yaptı.");
	}
	
	public void updatePassword(User user) {
		System.out.println(user.getFirstName() + " adlı Kullanıcı Parolası Güncellendi");
	}
	public void addCourse(){
		System.out.println("Kurs Eklendi");
	}
	public void singUp(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " kullanıcısı eklendi.");
	}
	
	public void mutipleSingUp(User[] user) {
		for (User user2 : user) {
			System.out.println(user2.getFirstName()+" " + user2.getLastName() + " kullanıcısı eklendi.");
		}
	}
}
