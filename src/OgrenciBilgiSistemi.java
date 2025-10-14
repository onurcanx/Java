public class OgrenciBilgiSistemi {
    static void main(String[] args) {
        Teacher t1 =new Teacher("Osman","555","TRH");
        Teacher t2 =new Teacher("Onur","555","FZK");
        Teacher t3 =new Teacher("Ahmet","555","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","103","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji","101","BIO");
        bio.addTeacher(t3);

        Student s1= new Student("Hakan","4","21561",tarih,fizik,bio);
        Student s2=new Student("Ali Osman","1","5213",tarih,fizik,bio);
        s1.addBulkNote(100,50,60,50,50,50);
        s1.isPass();
        s2.addBulkNote(50,60,70,0,80,20);
        s2.isPass();
    }
}
