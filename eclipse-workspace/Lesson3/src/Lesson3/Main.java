package Lesson3;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Muhammed Murat");
		student.setLastName("ACAR");
		student.setEmail("muhammedmuratacarr@gmail.com");
		student.setPassword("murat123");
		student.setCourse("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		student.setCourseProgress(46);
		
		Student student2=new Student();
		student2.setId(2);
		student2.setFirstName("Osman");
		student2.setLastName("ÇETİN");
		student2.setEmail("osmancetin@gmail.com");
		student2.setPassword("osman123");
		student2.setCourse("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		student2.setCourseProgress(80);
		
		Instructor instructor=new Instructor();
		instructor.setId(3);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMİROĞ");
		instructor.setEmail("engindemiroğ@gmail.com");
		instructor.setPassword("engin123");
		instructor.setCourse("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		instructor.setBranch("Yazılım Eğitmeni");
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		studentManager.addComment(student, "Dersler çok verimli geçiyor.");
		instructorManager.createCourse("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		instructorManager.startLiveBroadcast(instructor);
		instructorManager.finishLiveBroadcast(instructor);
		userManager.logIn(student);
		userManager.logOut(student);
		
		User[] users= {student,student2};
		userManager.mutipleSingUp(users);
		
		
		
	}

}
