class EmployDetails {

    long empId;
    String name;
    double basicSalary;

    EmployDetails(long empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public String toString(){
        String str = "empId = " + empId + " Name = " + name  + " basicSalary = " + basicSalary;
        return str;
    }

    void setEmpId(long id) {
        empId = id;
    }

    void setName(String cust) {
        name = cust;
    }

    void setBasicSalary(double basic) {
        basicSalary = basic;
    }

    long getEmpId() {
        return empId;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    double getGrossSalary() {
        double da = 1.2 * basicSalary;
        double hra = 0.3 * basicSalary;
        return (basicSalary + da + hra);
    }
}
