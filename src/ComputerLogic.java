public class ComputerLogic {
    public static int matches = 20;

    public ComputerLogic() {

    }

    public int computerMove() {
        return (matches - 1) % 4;
    }
}
