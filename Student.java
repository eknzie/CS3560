class Student{
    private String name;
    private String major;
    private double gpa;

    public Student() {
        this.name = "Unknown";
        this.major = "Undeclared";
        this.gpa = 0.0;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
    }

    @Override
    public String toString() {
        return "Student\n" + "name: " + name +"\nmajor: " + major + "\ngpa: " + gpa + "\n";   
    }

    @Override  
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && major.equals(student.major);
    }
}