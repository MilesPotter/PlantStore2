public class PlantStoreFactory {
    String location;
    int sqft;
    boolean isOpen;

    public static void main(String[] args) {
        PlantStoreFactory myStore;  // declare
        myStore = new PlantStoreFactory();  // construct
        myStore.location = "Egypt";
        myStore.sqft = 1500;
        myStore.isOpen = true;
        System.out.println("My" + myStore.sqft + "sqft store is in" + myStore.location);
    }

    public PlantStoreFactory() {
        Flower flower1; // declare cone one
        flower1 = new Flower();

        flower1.species = "rose";
        flower1.color = "red";
        flower1.height = 3;
        flower1.printinfo();

        Tree Tree1;
        Tree1 = new Tree();
        Tree1.species = "Oak";
        Tree1.trunkdiameter = 20;
        Tree1.height = 50;
        Tree1.printinfo();
    }



}
