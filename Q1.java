class Student {
    int rollNo;
    String name;
    int totalMarks;
    double percentage;

    Student(int rollNo, String name, int totalMarks){

        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String toString() {
        return ("name = " + this.name + " rollno = " + this.rollNo + " totalmarks = " + this.totalMarks + " Percentage = " + this.percentage + " %");
    }

    void findPercentage() {
        percentage = totalMarks / 6;
        // System.out.println("Your Percentage is : " + totalMarks / 6);
    }
}
