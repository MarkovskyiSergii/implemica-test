package service;

import tasks.FirstTask;
import tasks.SecondTask;
import tasks.TasksStartable;
import tasks.ThirdTask;

import java.util.Scanner;

/**
 * This service is UI to input data and write in console
 * responses tasks
 */
public class ConsoleVisualService {
    public void startVisualizingTasks() {
        Scanner scanner = new Scanner(System.in);
        int inputChoice, firstInput, secondInput, thirdInput;
        boolean workApp = true;
        TasksStartable firstTask = new FirstTask();
        TasksStartable secondTask = new SecondTask();
        TasksStartable thirdTask = new ThirdTask();
        System.out.println("\t\t\tStart the test");

        while (workApp) {
            System.out.println("\tMake choice to start one of the Task or \n" +
                    "\t\tpress Zero to close application");
            System.out.println("\tEnter from 1 to 3 number");
            inputChoice = scanner.nextInt();
            if (inputChoice < 0 || inputChoice > 3) {
                System.out.println("\tIncorrect number! Enter only from 1 to 3");

            } else {
                switch (inputChoice) {
                    case 1:
                        System.out.println("\t\t\tWelcome to First task");
                        System.out.println("\tEnter quantity pairs of correct parenthesis");
                        firstInput = scanner.nextInt();
                        firstTask.startTest(firstInput, 0, 0);
                        break;
                    case 2:
                        System.out.println("\t\t\tWelcome to Second task");
                        System.out.println("\tEnter quantity of tests 0 < quantity <= 10");
                        firstInput = scanner.nextInt();
                        System.out.println("\tEnter quantity  of cities 2 < quantity <= 10000");
                        secondInput = scanner.nextInt();
                        System.out.println("\tEnter the choice Data init! Must be 1 or 2");
                        System.out.println("\t1 - 4 cities from test task");
                        System.out.println("\t2 - 8 cities, schema in directory resources");
                        thirdInput = scanner.nextInt();
                        secondTask.startTest(firstInput, secondInput, thirdInput);
                        break;
                    case 3:
                        System.out.println("\t\t\tWelcome to Third task");
                        System.out.println("\tEnter number factorial to find the sum of the digits. Must be > 0.");
                        firstInput = scanner.nextInt();
                        thirdTask.startTest(firstInput, 0, 0);
                        break;
                    case 0:
                        workApp = false;
                }
            }
        }
    }
}
