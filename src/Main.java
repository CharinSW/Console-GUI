import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[])
    {
        int[][] letter_H = {
            {0,       3}, 
            {0,       3}, 
            {0, 1, 2, 3}, 
            {0,       3},
            {0,       3}
        };

        int[][] letter_E = {
            {0, 1, 2, 3},
            {0},
            {0, 1, 2, 3},
            {0},
            {0, 1, 2, 3}
        };

        int[][] letter_L = {
            {0},
            {0},
            {0},
            {0},
            {0, 1, 2, 3}
        };
        int[][] letter_O = {
            {0, 1, 2, 3},
            {0,       3}, 
            {0,       3}, 
            {0,       3}, 
            {0, 1, 2, 3}
        };

        Graphics screen = new Graphics(100, 50);  
        
        screen.render(letter_H, 20, 20);
        screen.display();

        pause(500);
        screen.render(letter_E, 25, 20);
        screen.display();

        pause(500);
        screen.render(letter_L, 30, 20);
        screen.display();

        pause(500);
        screen.render(letter_L, 35, 20);
        screen.display();
        
        pause(500);
        screen.render(letter_O, 40, 20);
        screen.display();
    }


    // Duration in ms
    public static void pause(int duration)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(duration);
        }
        catch (InterruptedException e)
        {
            System.exit(1);
        }
    }
}


