 import java.util.*;
 class Member extends GymMembershipSystem{

    int id;
    String name;
    int mobile;
    char gender;
    int remainingMembership;
    CheckInRecord c1;
    Gymstatics g1;

    Member(CheckInRecord c1, Gymstatics g1){
        this.c1 = c1;
        this.g1 = g1;
    }

    void registerMember(int id, String name,int mobile, String membershipPlan, char gender){
        this.id = id;
        this.name = name;
        this.mobile = mobile;
       this.membershipPlan = membershipPlan;
       this.gender = gender;
    }

    void info(){
        System.out.println("Members Information : \n" + this.name + "\n" + this.gender +"\n"+ this.id +"\n"+ this.mobile +"\n"+ this.membershipPlan);
    }

    void renewMembership(int id){

        if(this.id != id){
        System.out.println("invalid id");
        return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("your current status is : " + this.membershipPlan);
        System.out.print("enter the membership Plan : ");
         this.membershipPlan = sc.nextLine();

        if(this.membershipPlan.equals("prime")){
            System.out.println("amount payable is : 24000" );
        }
        else if(this.membershipPlan.equals("regular")){
            System.out.println("amount payable is : 12000" );
        }

        System.out.println("Your membership was Renewed successfully");
    }

    void cancelMemebership(int id){

        if(this.id != id){
            System.out.println("invalid id");
            return;
            }
        if(remainingMembership < 3){
            System.out.println("Membership canceled with no refund");
        }
        else if(remainingMembership >= 4 && remainingMembership <= 12){
            System.out.println("Membership canceled with 25% refund");
        }
        else if(remainingMembership > 12){
            System.out.println("Membership canceled with 50% refund");
        }

        this.membershipPlan = null;
        g1.activeMember = false;
    }
    
}
