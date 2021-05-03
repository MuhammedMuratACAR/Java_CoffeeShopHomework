package Lesson3;

public class InstructorManager {
	public void createCourse(String kurs){
		System.out.println(kurs + " Kursu Eklendi");
	}
	public void updateCourse() {
		System.out.println("Kurs Güncellendi");
	}
	public void deleteCourse() {
		System.out.println("Kurs Silindi");
	}
	
	public void startLiveBroadcast(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Canlı Yayın Başlatıldı.");
	}
	public void finishLiveBroadcast(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Canlı Yayın Bitti.");
	}
}
