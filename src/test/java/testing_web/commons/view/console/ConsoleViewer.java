package testing_web.commons.view.console;

import cucumber.api.Scenario;

public class ConsoleViewer {


    public static void printResult(Scenario scenario) {
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println(scenario.getName() + " - " + scenario.getStatus().toUpperCase());
        System.out.println("------------------------------------------------------------------------");
    }

    public static void printStartOfTest(Scenario scenario) {
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println( "TEST: " + scenario.getName() + " - STARTED");
        System.out.println("------------------------------------------------------------------------");
    }


}
