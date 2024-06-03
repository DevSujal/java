 class CheckInRecord extends GymMembershipSystem{

    double checkInTime, checkOutTime;
    Member m1;

    CheckInRecord(){

    }

    CheckInRecord(Member m1, double checkInTime, double checkOutTime)
    {
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.m1 = m1; 
    }

    void info(){
        System.out.println("Members Information : \n" + m1.name + "\n" + m1.gender +"\n"+ m1.id +"\n"+ m1.mobile +"\n"+ m1.membershipPlan);

    }

    void enterGym(int id) {
        System.out.println("Member checked in: " + id);
        info();
    }

    void leaveGym(int id) {
        System.out.println("Member checked out: " + id + "\n" + "Total Time Gymed today = " + Math.abs(checkOutTime - checkInTime));
        info();
    }
}
    
