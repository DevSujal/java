 class Gymstatics extends GymMembershipSystem{

    boolean activeMember;
    double revenueGenreated, totalMembershipDuration;
    Member m1;
    Gymstatics(){

    }

    Gymstatics(boolean activeMember, double revenueGenreated, double totalMembershipDuration, Member m1){
        this.activeMember = activeMember;
        this.revenueGenreated = revenueGenreated;
        this.totalMembershipDuration = totalMembershipDuration;
        this.m1 = m1;
    }


    void info(){
        System.out.println("Members Information : \n" + m1.name + "\n" + m1.gender +"\n"+ m1.id +"\n"+ m1.mobile +"\n"+ m1.membershipPlan);
    }

    void setStatistics(){

        if(this.membershipPlan.equals(null)){
            this.activeMember = false;
        }
        else
        this.activeMember = true;

       this.revenueGenreated = this.amount;

       info();
        
    }



    
}
