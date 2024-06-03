// import java.util.Arrays;

class GymMembershipSystem {
     String gymName;
     String membershipPlan;
     double amount;

    public GymMembershipSystem(String gymName, String membershipPlan, double amount) {
        this.gymName = gymName;
        this.membershipPlan = membershipPlan;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Membership Plans:");
        System.out.println("Regular: Rs. 12,000 per year");
        System.out.println("Prime: Rs. 240,000 per year");
    }

    public void display(int years) {
        double calculatedAmount = amount * years;
        System.out.println("Membership Plan for " + years + " years:");
        System.out.println(membershipPlan + ": Rs. " + calculatedAmount);
    }
}

class Member extends GymMembershipSystem {
     int id;
     String name;
     int mobile;
     char gender;

    public Member(String gymName, String membershipPlan, double amount, int id, String name, int mobile, char gender) {
        super(gymName, membershipPlan, amount);
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
    }

    public void registerMember(int id, String name, int mobile, String membershipPlan) {
        System.out.println("Member registered successfully.");
    }

    public void renewMembership(int id) {
        if (id == this.id) {
            System.out.println("Current Membership Status: Active");
            System.out.println("Please provide renewal details:");
            display();
            System.out.println("Membership renewed.");
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void cancelMembership(int id) {
        if (id == this.id) {
            System.out.println("Remaining Membership: 6 months");
            System.out.println("Membership is canceled with 25% refund");
        } else {
            System.out.println("Invalid ID");
        }
    }
}

class CheckInRecord extends GymMembershipSystem {
     String checkInTime;
     String checkOutTime;

    public CheckInRecord(String gymName, String membershipPlan, double amount, String checkInTime, String checkOutTime) {
        super(gymName, membershipPlan, amount);
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public void enterGym(int id) {
        System.out.println("Member with ID " + id + " checked in at " + checkInTime);
        System.out.println("Collective information of the member:");
        // Display member information
    }

    public void leaveGym(int id) {
        System.out.println("Member with ID " + id + " checked out at " + checkOutTime);
        System.out.println("Total time spent in the gym today: 2 hours");
        System.out.println("Collective information of the member:");
        // Display member information
    }
}
class GymStatistics extends GymMembershipSystem {
     boolean activeMember;
     double revenueGenerated;
     double totalMembershipDuration;

    public GymStatistics(String gymName, String membershipPlan, double amount, boolean activeMember, double revenueGenerated, double totalMembershipDuration) {
        super(gymName, membershipPlan, amount);
        this.activeMember = activeMember;
        this.revenueGenerated = revenueGenerated;
        this.totalMembershipDuration = totalMembershipDuration;
    }

    public void setStatistics(boolean activeMember, double revenueGenerated, double totalMembershipDuration) {
        this.activeMember = activeMember;
        this.revenueGenerated = revenueGenerated;
        this.totalMembershipDuration = totalMembershipDuration;
    }

    public void displayStatistics() {
        System.out.println("Membership Statistics:");
        System.out.println("Active Member: " + activeMember);
        System.out.println("Revenue Generated: Rs. " + revenueGenerated);
        System.out.println("Total Membership Duration: " + totalMembershipDuration + " months");
    }
}

public class Oop {
    public static void main(String[] args) {
        Member[] members = new Member[12];

        // Initialize regular members
        members[0] = new Member("Power Gold Gym", "Regular", 12000, 1, "John", 1234567890, 'M');
        members[1] = new Member("Power Gold Gym", "Regular", 12000, 2, "Emma", 987654321, 'F');
        members[2] = new Member("Power Gold Gym", "Regular", 12000, 3, "Michael", 456781230, 'M');
        members[3] = new Member("Power Gold Gym", "Regular", 12000, 4, "Sophia", 789124560, 'F');
        members[4] = new Member("Power Gold Gym", "Regular", 12000, 5, "William", 321549870, 'M');

        // Initialize prime members
        members[5] = new Member("Power Gold Gym", "Prime", 240000, 6, "Olivia", 1597538640, 'F');
        members[6] = new Member("Power Gold Gym", "Prime", 240000, 7, "James", 369251470, 'M');
        members[7] = new Member("Power Gold Gym", "Prime", 240000, 8, "Ava", 1472583690, 'F');
        members[8] = new Member("Power Gold Gym", "Prime", 240000, 9, "Daniel", 258691470, 'M');
        members[9] = new Member("Power Gold Gym", "Prime", 240000, 10, "Mia", 987643210, 'F');

        // Cancel some memberships
        members[3].cancelMembership(4);
        members[4].cancelMembership(5);
        members[8].cancelMembership(9);
        members[9].cancelMembership(10);

        // Print active members
        System.out.println("Active Members:");
        for (Member member : members) {
            if (member != null) {
                System.out.println(member.name + " (" + member.membershipPlan + ")");
            }
        }

        // Print female members
        System.out.println("Female Members:");
        for (Member member : members) {
            if (member != null && member.gender == 'F') {
                System.out.println(member.name + " (" + member.membershipPlan + ")");
            }
        }
    }
}
