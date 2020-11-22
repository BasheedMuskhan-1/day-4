package day4;

public class GreetingsMain
{

	public static void main(String[] args)
	{
		
		Greetings gr=new English();
		gr.morning();
		gr.afternoon();
		gr.evening();
		gr.night();
		gr=new Hindi();
		gr.morning();
		gr.afternoon();
		gr.evening();
		gr.night();
		gr=new Telugu();
		gr.morning();
		gr.afternoon();
		gr.evening();
		gr.night();
	}

}
