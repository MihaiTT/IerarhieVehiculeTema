public class OnRoad extends Vehicle {
    int noWheels;
    int noDoors;
    public OnRoad(){
        super();
        this.noDoors=4;
        this.noWheels=4;
    }
    public OnRoad(String serialNumber, int noPersons){
        super(serialNumber,noPersons);
    }
    public OnRoad(String serialNumber,int noPersons,String name){
        super(serialNumber,noPersons,name);
    }
    public OnRoad(String serialNumber, int noPersons,String name, int noWheels){
    super(serialNumber,noPersons,name);
    this.noWheels=noWheels;
    }
    public OnRoad(String serialNumber,int noPersons,String name,int noWheels,int noDoors){
        this(serialNumber,noPersons,name,noWheels);
        this.noDoors=noDoors;
    }
    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.print("Driving the vehicle on road to coordinates: " + positionX+" "+positionY);
        return true;
    }
    @Override
    public boolean addFuel(double amount){
        System.out.print("Adding "+amount+" of fuel to the driving vehicle");
        return true;
    }
    @Override
    public void printInfo(){
       super.printInfo();
        System.out.println("Driving vehicle properties:");
        System.out.println("no of wheels "+ this.noWheels);
        System.out.println("no of doors "+this.noDoors);

    }

}
