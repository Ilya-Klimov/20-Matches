public class Output {
    public Output() {

    }

    public void matchesCount(){
        System.out.println("На столе осталось " + ComputerLogic.matches + " спичек.");
    }

    public void computerMove(int number){
        System.out.println("- Количество выбранных компьютером спичек = " + number + ".");
    }

    public void playerMove(){
        System.out.print("- Ход игрока. Введите количество спичек: ");
    }

    public void error(){
        System.out.println("Некорректное количество спичек!");
    }

    public void start(){
        System.out.println("Игра началась");
    }

    public void finish(){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
