import java.util.ArrayList;

public class Graphics
{
    private String[][] pixels;
    private String full;
    private String empty;
    private int width;
    private int height;
    private String screen;

    Graphics(int width, int height)
    {
        this.height = height;
        this.width = width;
        full = "  ";
        empty = "██";
        pixels =  new String[height][width];

        all_empty();
        update();
    }

    public int get_width()  {return width;}
    public int get_height() {return height;}
    
    // Note that the return values below will be truncated to a whole number
    public int get_center_width() {return width/2;}
    public int get_center_height() {return height/2;}


    public void all_empty()
    {
        for (int h = 0; h < height; h++)
        {
            for (int w = 0; w < width; w++)
            {
                pixels[h][w] = empty;
            }
        }
    }


    public void all_full()
    {
        for (int h = 0; h < height; h++)
        {
            for (int w = 0; w < width; w++)
            {
                pixels[h][w] = full;
            }
        }
    }


    public void clear()
    {
        screen = "";
        System.out.print("\n");
    }
    
    
    public void update()
    {
        for (int h = 0; h < height; h++)
        {
            for (int w = 0; w < width; w++)
            {
                if (!(w == 0 && h == 0))
                {
                    screen += pixels[h][w];
                }
                else
                {
                    screen = pixels[h][w];
                }
            }
            screen += ("\n");
        }
    }


    public void display()
    {
        clear();
        update();
        System.out.print(screen);
    }


    // (0, 0) is at the top-left
    public void render(int[][] shape, int x, int y)
    {
        int count_row = 0;

        for (int[] row: shape)
        {
            for (int column: row)
            {
                pixels[count_row + y][column + x] = full;
            }

            count_row++;
        }
    }

    public void render(ArrayList<ArrayList<Integer>> arr, int x, int y)
    {
        for (int row = 0; row < arr.size(); row++)
        {
            for (int column = 0; column < arr.get(row).size(); column++)
            {
                pixels[row + y][arr.get(row).get(column) + x] = full;
            }
        }
    }
}
