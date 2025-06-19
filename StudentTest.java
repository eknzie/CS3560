public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student ("John", "CS", 3.5);

        Student student2 = new Student();
        student2.setName("Mary Ann");
        student2.setMajor("CE");
        student2.setGpa(3.3);

        System.out.print(student1.toString());
        System.out.print(student2.toString());
    }
}
