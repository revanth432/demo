package FacedDesignPattern;

import java.util.Scanner;

public class main {
    public static MusicSystem ms=new MusicSystem();
    public static Bulb b=new Bulb();
    public static void main(String[] args)
    {
        int choice,n;
        do
        {
            System.out.println("choose your option : ");
            System.out.println("1: Bulb Remote");
            System.out.println("2: Music Player Remote");
            System.out.println("3: exit");

            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            boolean flag=false;
            switch (choice)
            {
                case 1:
                    do
                    {
                        System.out.println("bulb");
                        System.out.println("enter a key");
                        System.out.println("1: switch on");
                        System.out.println("2: switch off");
                        n = sc.nextInt();
                        switch (n)
                        {
                            case 1:
                                if (flag == false)
                                {
                                    b.SwitchOn();
                                } else
                                {
                                    System.out.println("bulb is already on");
                                }
                                break;
                            case 2:
                                if (flag != false)
                                {
                                    flag = false;
                                    b.SwitchOff();
                                } else
                                {
                                    System.out.println("Bulb is already off");
                                }
                                break;
                            default:
                                break;
                        }
                    }while (n<3);
                    break;

                case 2:
                    do
                    {

                        System.out.println("Music Player");
                        System.out.println("enter a key");
                        System.out.println("1: switch on");
                        System.out.println("2: switch off");
                        n = sc.nextInt();
                        switch (n)
                        {
                            case 1:
                                if (flag == false)
                                {
                                    flag=true;
                                    ms.SwitchOn();
                                } else
                                {
                                    System.out.println("Music Player is already on");
                                }
                                break;
                            case 2:
                                if (flag != false)
                                {
                                    flag = false;
                                    ms.SwitchOff();
                                } else
                                {
                                    System.out.println("Music Player is already off");
                                }
                                break;
                            default:
                                break;
                        }
                    }while (n<3);
                    break;
            }
        }while (choice!=3);

    }
}
