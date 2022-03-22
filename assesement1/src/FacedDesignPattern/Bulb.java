package FacedDesignPattern;

public class Bulb implements RemoteControl {
    public void SwitchOn()
    {
        System.out.println("light on");
    }
    public void SwitchOff()
    {
        System.out.println("light off");
    }
}
