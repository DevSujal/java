public class Main {
    public static void main(String[] args) {
        Member m[] = new Member[10];

        for(int i = 0; i < 10; i++){
            m[i] = new Member(new CheckInRecord(m[i], 9, 5), new Gymstatics(true, 24000, 12, m[i]));
        }
        // Regular Members
        m[0].registerMember(0, "sujal", 999999999, "regular", 'm');
        m[1].registerMember(1, "prajakta", 199999999, "regular", 'f');
        m[2].registerMember(2, "pratik", 119999999, "regular", 'm');
        m[3].registerMember(3, "vansh", 111999999, "regular", 'm');
        m[4].registerMember(4, "vedant", 111199999, "regular", 'm');       

        // Prime Members
        m[5].registerMember(5, "sujal1", 999999999, "prime", 'm');
        m[6].registerMember(6, "prajakta1", 199999999, "prime", 'f');
        m[7].registerMember(7, "pratik1", 119999999, "prime", 'm');
        m[8].registerMember(8, "vansh1", 111999999, "prime", 'm');
        m[9].registerMember(9, "vedant1", 111199999, "prime", 'm'); 
        
        m[2].remainingMembership = 5;
        m[3].remainingMembership = 9;
        m[4].remainingMembership = 8;
        m[7].remainingMembership = 2;
        m[8].remainingMembership = 2;
        m[9].remainingMembership = 13;
        m[2].cancelMemebership(2);
        m[3].cancelMemebership(3);
        m[4].cancelMemebership(4);
        m[7].cancelMemebership(7);
        m[8].cancelMemebership(8);
        m[9].cancelMemebership(9);

       System.out.println("following is the information of active members: ");

        for(int i = 0; i < 10; i++){
          if(m[i].g1.activeMember){
            m[i].info();
          }
        }

        System.out.println("following is the information of only female members: ");
        for(int i = 0; i < 10; i++){
            if(m[i].gender == 'f'){
                m[i].info();
            }
        }


    }
}
