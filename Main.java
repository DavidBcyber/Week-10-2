import java.util.Scanner;  // Import the Scanner class

class candidateName{ // Names for each candidate to vote
    String candidate1 = "Trump";
    String candidate2 = "Biden";
    String candidate3 = "Obama";
    
public candidateName(String trump, String biden, String obama){
    candidate1 = trump;
    candidate2 = biden;
    candidate3 = obama;
}

class Main {
  public static void main(String[] args) {
    while (true){ // repeat forever

    Scanner vote = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a number that you wish to vote for from the list below\n" +
    "1. Trump\n" + 
    "2. Biden\n" +
    "3. Obama\n" +
    "4. dispaly all votes\n" +
    "5. Exit");

    int candidateName = vote.nextInt();
    switch (candidateName) {
        case 1:
            // add one vote for trump
            String candidate1 = vote.nextLine();
            System.out.println("vote has succefully been added");
            break;
        case 2:
            // add one vote for biden
            String candidate2 = vote.nextLine();
            System.out.println("vote has succefully been added");
            break;
        case 3:
            // add one vote for obama
            String candidate3 = vote.nextLine();
            System.out.println("vote has succefully been added");
            break;
        case 4:
            //display all votes
            String Allcandidate = vote.nextLine();
            System.out.println("Here is all the votes for each candidate" + candidate1 + candidate2 + candidate3);
            break;
        case 5:
            // exit
            return;
        default:
            System.out.println("Invaild option");
            break;
    }
    


    }
    
  }
  
}
}