package pr07_GenericList;

import pr07_GenericList.interfaces.GenericList;
import pr07_GenericList.interfaces.Sortable;
import pr07_GenericList.models.GenericListImpl;
import pr07_GenericList.models.Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericList<String> list = new GenericListImpl<>();
        Sortable<String> sorter = new Sorter<>();

        CommandDispatcher dispatcher = new CommandDispatcher(list, sorter);

        while (!dispatcher.isEndDispatched()) {
            String[] line = scanner.nextLine().split("\\s+");
            dispatcher.dispatch(line);
        }
    }
}
