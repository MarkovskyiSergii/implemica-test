import service.ConsoleVisualService;

/**Test task for Implemica
 * Start main and application UI will created
 * in console.
 * @author Markovskyi Serhii
 */

public class Main {

    public static void main(String[] args) {
        ConsoleVisualService cvs = new ConsoleVisualService();

        cvs.startVisualizingTasks();
    }
}
