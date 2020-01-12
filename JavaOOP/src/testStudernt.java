import model.Student;

public class testStudernt {
    public static void main(String[] args){
        Student Std1 = new Student("Mary",15, "F", 165);
        System.out.println(Std1.getAge()+" "+Std1.getidNo());
        Std1.setAge(20);
        System.out.println(Std1.getAge()+" "+Std1.getidNo());

    }
}
