import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ComandUndoDriver {
    public static void main(String[] args) {
        Deque<Command> commands = new LinkedList<>();
        boolean keepGoing = true;
        while (keepGoing) {
            String msg = "Enter a Command->";
            String cmd = getUserInput(msg);
            msg = "Enter Command Options->";
            String cmdOptions = getUserInput(msg);
            if (cmd.equalsIgnoreCase("undo")) {
                if (commands.isEmpty()) {
                    System.out.printf("\n Nothing to undo");
                } else {
                    Command cmdUndo = commands.pop();
                    System.out.printf("\n Undoing:%s", cmdUndo.toString());
                }
            } else {
                Command c = new Command(cmd, cmdOptions);
                commands.push(c);
                System.out.printf("\n Just add:%s total:%s",
                        c.toString(), commands.size());
            }
        }

    }

    private static String getUserInput(String msg) {
        System.out.printf("\n %s", msg);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
