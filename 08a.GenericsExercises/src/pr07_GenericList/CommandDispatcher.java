package pr07_GenericList;

import pr07_GenericList.interfaces.GenericList;
import pr07_GenericList.interfaces.Sortable;

public class CommandDispatcher {
    private GenericList<String> genericList;
    private Sortable<String> sorter;
    private boolean isEndDispatched;

    public CommandDispatcher(GenericList<String> genericList) {
        this.genericList = genericList;
        this.isEndDispatched = false;
    }

    public CommandDispatcher(GenericList<String> genericList, Sortable<String> sorter) {
        this.genericList = genericList;
        this.sorter = sorter;
        this.isEndDispatched = false;
    }

    public boolean isEndDispatched() {
        return this.isEndDispatched;
    }

    public void dispatch(String... args) {
        String command = args[0].toLowerCase();

        switch (command) {
            case "add":
                this.genericList.add(args[1]);
                break;
            case "remove":
                this.genericList.remove(Integer.parseInt(args[1]));
                break;
            case "greater":
                System.out.println(this.genericList.countGreaterThan(args[1]));
                break;
            case "min":
                System.out.println(this.genericList.getMin());
                break;
            case "max":
                System.out.println(this.genericList.getMax());
                break;
            case "swap":
                this.genericList.swap(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "contains":
                System.out.println(this.genericList.contains(args[1]));
                break;
            case "sort":
                this.sorter.sort(this.genericList);
                break;
            case "print":
                this.genericList.print();
                break;
            case "end":
                this.isEndDispatched = true;
                break;
        }
    }
}
