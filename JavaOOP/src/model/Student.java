package model;

public class Student {
    public String name;
    private int age;
    private String gender;
    private int idNo;

    public Student(String name, int age, String gender, int idNo){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
    }

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getidNo(){
        return idNo;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setidNo(int idNo){
        this.idNo = idNo;
    }

}
