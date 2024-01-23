public class ClassesAndObjects2 {
    public static void main(String[] args) {
        Machines machines1 = new Machines();
        machines1.multiWheeledMachines("Велосипед", 2);
        Machines machines2 = new Machines();
        machines2.multiWheeledMachines("Автомобиль", 4);
        Machines machines3 = new Machines();
        machines3.multiWheeledMachines("Фура", 6);
        Machines machines4 = new Machines();
        machines4.multiWheeledMachines("Поезд", 666);
        System.out.println("На стоянке своими колёсами хвастались:");
        machines1.output();
        machines2.output();
        machines3.output();
        machines4.output();
    }
}
    class Machines {
        String type;
        int numberOfWheels;

        void multiWheeledMachines(String nameMachine, int wheelsMachine) {
            type = nameMachine;
            numberOfWheels = wheelsMachine;
        }
        void output() {
            System.out.println(type + " у которого " + numberOfWheels + " колёс,");
        }

    }
