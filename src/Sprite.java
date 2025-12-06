import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sprite
{
    private int width;
    private int height;
    private ArrayList<ArrayList<Integer>> layout;


    Sprite(String file_name)
    {
        layout = new ArrayList<ArrayList<Integer>>();
        width = 0;  // True is set below

        File img_file = new File(file_name);

        try (Scanner img_reader = new Scanner(img_file))
        {
            int count_line = 0;
            while (img_reader.hasNextLine())
            {   
                layout.add(new ArrayList<Integer>());
                String line = img_reader.nextLine();
                String number = "";

                // Iterating thru each character in the current line
                for (int i = 0; i < line.length() && line.length() > 1; i++)
                {
                    if (Character.isDigit(line.charAt(i)))
                    {
                        number += line.charAt(i);
                    }
                    else if (line.charAt(i) == ',')
                    {
                        layout.get(count_line).add(Integer.parseInt(number));
                        width = (Integer.parseInt(number) > width) ? Integer.parseInt(number) : width;
                        number = "";
                    }

                }

                count_line++;
            }

            height = layout.size();
            width++;    // Since pixels are 0 indexed
        }
        catch (FileNotFoundException e)
        {
            System.err.println("ERROR: Cound't find " + img_file.getName());
            e.printStackTrace();
        }
    }


    public ArrayList<ArrayList<Integer>> get_layout()
    {
        return layout;
    }

    public int get_width()
    {
        return width;
    }

    public int get_height()
    {
        return height;
    }
}
