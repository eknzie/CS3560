public class Student2 {
    private String name;
    private Transcript transcript;

    public Student2(String name, String course, double grade) {
        this.name = name;
        this.transcript = new Transcript(course, grade);
    }
}

