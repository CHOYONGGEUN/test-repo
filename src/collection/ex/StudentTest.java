package collection.ex;

import java.util.HashSet;

public class StudentTest {

    public static void main(String[] args) {
        Student studentHong = new Student("100", "홍길동");
        Student studentKang = new Student("200", "강감찬");
        Student studentLee = new Student("300", "이순신");
        Student studentJeong = new Student("400", "정약용");
        Student studentSong = new Student("100", "송중기");

        HashSet<Student> set = new HashSet<>();
        set.add(studentHong);
        set.add(studentKang);
        set.add(studentLee);
        set.add(studentJeong);
        set.add(studentSong);
        System.out.println(set);
    }
}
