package linkedinTutorials.substitutionperincipleAndWildcards;

import java.util.ArrayList;
import java.util.List;

public class SubstitutionExample {

    public static void main(String[] args) {

        // List of buildings
        List<Device> devices = new ArrayList();
        devices.add(new Device());
        devices.add(new Device());
        printDevices(devices);

        // List of offices
        List<Mobile> mobiles = new ArrayList();
        mobiles.add(new Mobile());
        mobiles.add(new Mobile());
        printDevices(mobiles);

        // List of houses
        List<Desktop> desktops = new ArrayList();
        desktops.add(new Desktop());
        desktops.add(new Desktop());
        printDevices(desktops);

        printDevices(mobiles);
        printDevices(devices);

    }
    //the "List<? extends Device" enabels the code to send any list of instances
    //that extends Devices
    static void printDevices(List<? extends Device> devices){
        for(int i = 0; i < devices.size(); i++) {
            System.out.println(devices.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }
    // same as above but for SUPER
    static void addMobileToList(List<? super Mobile> mobiles){
        mobiles.add(new Mobile());
        System.out.println();
    }
}
