import javax.sound.sampled.SourceDataLine;

public class Droid{
    String name;
    int batteryLevel;
    public Droid(String droidName){
        batteryLevel = 100;
        name = droidName;
    }
    public String toString(){
        return "Hello, I'm the droid: " + name;
    }
    // Doing Droid Things
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }
    public static void main(String[] args) {
        // Declaring Instances of Drone
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
    }
}