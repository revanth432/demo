package FacedDesignPattern;

public class MusicSystem implements RemoteControl {
    public void SwitchOn()
    {
        System.out.println("music on");
    }
    public void SwitchOff()
    {
        System.out.println("music off");
    }
}
