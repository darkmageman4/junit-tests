import java.util.ArrayList;

public class Student {
long id;
String name;
ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
//        ArrayList<Integer> grades = new ArrayList<Integer>();

        float sum = 0;

        //compute sum
        for(int grade:grades) {
            sum += grade;
        }

        //compute average
        float average = (sum / grades.size());

        System.out.println("Average : "+average);
        return average;
    }

    public static void updateGrade() {

    }

    public static void deleteGrade() {

    }







}
