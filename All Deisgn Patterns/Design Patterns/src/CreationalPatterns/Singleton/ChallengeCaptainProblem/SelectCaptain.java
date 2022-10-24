package CreationalPatterns.Singleton.ChallengeCaptainProblem;

public class SelectCaptain {
    public static void main(String[] args) {
        System.out.println("Selecting a new captain for our team.");
        Captain captain = Captain.getCaptain();
        if(captain != null) {
            System.out.println("New captain has been selected");
        }
        System.out.println("Trying to elect another captain for our team.");
        Captain captain1 = Captain.getCaptain();
        if(captain.equals(captain1)) {
            System.out.println("You have already selected your captain. Send him for toss.");
        }
        System.out.println(captain + " and " + captain1 + " are the same objects : " + captain1.equals(captain) + ".");
    }
}
