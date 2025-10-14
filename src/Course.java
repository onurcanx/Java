public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note=0;
    Course(String name , String code , String prefix)
    {
        this.code=code;
        this.name=name;
        double note =0;
        this.prefix=prefix;

    }
    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix)){this.teacher=teacher;}
        else System.out.println("Öğretmen ile ders bölümleri uyuşmuyor");
    }
    void printTeacher(Teacher teacher)
    {
        this.teacher.print();
    }
}
