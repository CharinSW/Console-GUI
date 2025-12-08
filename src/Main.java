import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[])
    {
        Sprite some_shape = new Sprite("res\\test.txt");
        Sprite letter_H = new Sprite("res\\H.txt");

        Graphics screen = new Graphics(100, 50);  
       
        screen.render(some_shape.get_layout(), 5, 20);
        screen.render(letter_H.get_layout(), screen.get_center_width() - letter_H.get_width() / 2, screen.get_center_height() - letter_H.get_height() / 2);
        screen.display();

        System.out.printf("Width:\t%d\nHeight:\t%d", some_shape.get_width(), some_shape.get_height());
        System.out.printf("Width:\t%d\nHeight:\t%d", some_shape.get_width(), some_shape.get_height());
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


