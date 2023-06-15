public class Q4_Student {
    public  String name;
    public  char gender;
    private  String date_of_birth;
    private  double cgpa;
    public Q4_Student(String name ,char gender,String date_of_birth,double cgpa)
    {
        this.name=name;
        this.gender=gender;
        this.date_of_birth=date_of_birth;
        this.cgpa=cgpa;

    }
    public  void display()
    {

        System.out.println("Name:"+name);
        System.out.println("Gender: "+gender);
        System.out.println("Date of Birth:"+date_of_birth);
        System.out.println("CGPA:"+cgpa);

    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
