import java.util.ArrayList;
//import java.util.HashMap;


abstract class elements 
{
    String name;
    ArrayList<String> colors = new ArrayList<String>();
    String speak(String color) 
	{
        return "I'm " + name + "! I'm sometimes " + color;
    }
}

class apple extends elements 
{
	apple() 
	{
		name = "Apple";
		colors.add("red");
		colors.add("green");
    }
}

class banana extends elements 
{
	banana() 
	{
		name = "Banana";
		colors.add("yellow");
		colors.add("green");
    }
}

class salt extends elements 
{
	salt() 
	{
		name = "Salt";
        colors.add("white");
    }
}

class ink extends elements 
{
	ink() 
	{
		name = "Ink";
        colors.add("red");
        colors.add("black");
    }
}

class blood extends elements 
{
	blood() 
	{
        name = "Blood";
        colors.add("red");
    }
}

class sky extends elements 
{
    sky() 
    {
        name = "Sky";
        colors.add("blue");
        colors.add("black");
    }

}

class frog extends elements 
{
    frog() 
    {
        name = "Frog";
        colors.add("blue");
        colors.add("yellow");
    }

    String speak(String color) 
    {
        return "I'm " + name + "! I am " + color + " today";
    }

}
