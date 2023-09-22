package DesignPatterns.CreationalPatterns.Singleton.ChallengeCaptainProblem;

public class Captain {
    private Captain () {}

    private static class CaptainBuilder {
        private static Captain captainInstance = new Captain();
    }

    public static Captain getCaptain() {
        return CaptainBuilder.captainInstance;
    }
}
