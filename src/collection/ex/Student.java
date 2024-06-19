package collection.ex;


import java.util.Comparator;

public class Student  {
    private String num;
    private String name;

    public Student(String num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return num + " : " + name;
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(num);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (this.num == student.num) {
                return true;
            }
            return false;
        }
        return false;
    }
}
