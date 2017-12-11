public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_DEVICES = 3;
        Device[] devices = new Device[NUMBER_OF_DEVICES];

        devices[0] = new Device("Lenovo", 250, "10003485");
        devices[1] = new Monitor("Samsung", 300, "74902030", 1024, 780);
        devices[2] = new EthernetAdapter("TP-Link", 150, "3847933", 80000, "ac:22:0b:95:87:3e");

        for(Device device:devices){
            System.out.println(device);
        }

        Device test1 = new Device("Lenovo", 250, "10003485");
        Device test2 = new Monitor("Samsung", 300, "74902030", 1024, 780);
        Device test3 = new EthernetAdapter("TP-Link", 150, "3847933", 80000, "ac:22:0b:95:87:3e");
        System.out.println(test1.equals(test2));
        System.out.println(test2.equals(test3));
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
    }
}
