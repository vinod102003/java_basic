
 class student
 {
    private int age;
    private String name;
        student(int n1,int n2)
        {
         int n =n1+n2;
      System.out.println(n);
        }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        student obj = new student(87,89);
        obj.setAge(78);
        obj.setName("vinod");
        String stud1Name=obj.getName();
       int stud1Age   =obj.getAge();
        System.out.println(stud1Age+" "+stud1Name);

    }
}