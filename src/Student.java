public class Student {
    String name;
    String stuNo;
    String  classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    Student(String name, String classes, String stuNo, Course c1,Course c2,Course c3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAvarage();

    }
    void addBulkNote(double note1, double note2 ,double note3,int soz1,int soz2,int soz3)
    {
        if (note1>=0 && note1<=100 && soz1>=0 && soz1<=100)
        {
            this.c1.note=(note1*0.8)+(soz1*0.2);
        }
        if (note2>=0 && note2<=100 && soz2>=0 && soz2<=100)
        {
            this.c2.note=(note2*0.8)+(soz2*0.2);
        }
        if (note3>=0 && note3<=100 && soz3>=0 && soz3<=100 )
        {
            this.c3.note=(note3*0.8)+(soz3*0.2);
        }
    }
    void isPass()
    {
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarage>=55) {
            System.out.println("Sınıfı Geçtiniz");
            this.isPass=true;
        }

        else{

            System.out.println("Sınıfta Kaldınız");
            this.isPass=false;
        }
        printNote();
    }
    void calcAvarage()
    {

    }
    void printNote()
    {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu Ortalaması : " + this.c1.note);
        System.out.println("Fizik Notu Ortalaması : " + this.c2.note);
        System.out.println("Kimya Notu Ortalaması : " + this.c3.note);
        System.out.println("Ortalamanız Ortalaması : "+this.avarage);
    }
}
