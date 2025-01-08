package interfacesegregation;

public class InterfaceSegregation {
    public static void main(String[] args) {
        /*
         * bowler doesn't need to implement wicketkeeping
         */
        MultiBehaviourPlayer bowler = new SubOptimalBowlerImpl();
        bowler.bat();bowler.bowl();bowler.field();bowler.wicketKeeping();

        /*
         * Segregating set of related behaviours into separate Interfaces
         */
        BowlerImpl onlyBowlerBehaviour = new BowlerImpl();
        onlyBowlerBehaviour.bat(); onlyBowlerBehaviour.bowl();
    }
}
