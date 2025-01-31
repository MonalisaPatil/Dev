
class Computer
{
    public void playMusic()
    {
        System.out.println("playing Music");
    }

    public String Dance(int cost)
    {
        return "Dancing";

    }
}


public class Method {
    public static void main(String[] args)
    {

        Computer comp = new Computer();
        comp.Dance(10);
        comp.playMusic();
    }
}
