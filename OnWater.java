public class OnWater extends Vehicle {

    int noEngines;
    int cargoCapacity;

    public OnWater(){
        super();
        this.noEngines=2;
        this.cargoCapacity=2;
    }
    public OnWater(String serialNumber,int noPersons){
        super(serialNumber,noPersons);
        this.noEngines=2;
        this.cargoCapacity=2;

    }
    public OnWater(String serialNumber,int noPersons,String name){
        super(serialNumber,noPersons,name);
        this.noEngines=2;
        this.cargoCapacity=2;
    }
    public OnWater(String serialNumber,int noPersons,String name,int noEngines){
        this(serialNumber,noPersons,name);
        this.noEngines=noEngines;
    }
    public OnWater(String serialNumber,int noPersons,String name,int noEngines,int cargoCapacity){
        this(serialNumber,noPersons,name,noEngines);
        this.cargoCapacity=cargoCapacity;
    }
    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Sailing the vessel to coordinates "+positionX+" "+positionY);
        return true;
    }
    @Override
    public boolean  addFuel(double amount){
        System.out.println("Adding "+ amount+" of fuel to the vessel");
        return true;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Vessel properties:");
        System.out.println("no of engines: "+this.noEngines);
        System.out.println("cargo capacity: "+this.cargoCapacity);
    }

}
