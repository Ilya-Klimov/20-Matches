import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;

        Output output = new Output();
        ComputerLogic computerLogic = new ComputerLogic();
        Scanner scanner = new Scanner(System.in);

        output.start();
        output.matchesCount();

        while (ComputerLogic.matches >  1) {
            input = 0;
            output.computerMove(computerLogic.computerMove());
            ComputerLogic.matches -= computerLogic.computerMove();
            if (ComputerLogic.matches == 1){
                break;
            }
            output.matchesCount();
            while ((input > 3) || (input <= 0)) {
                output.playerMove();
                input = scanner.nextInt();
                if ((input > 3) || (input <= 0)) {
                    output.error();
                }
            }

            ComputerLogic.matches -= input;
            output.matchesCount();
        }

        output.finish();
    }
}
