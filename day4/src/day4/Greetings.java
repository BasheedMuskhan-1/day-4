package day4;


interface Greetings
{
	public abstract void morning();
	public abstract void afternoon();
	public abstract void evening();
	public abstract void night();
	
}
class English implements Greetings
{
  public void morning()
  {
	  System.out.println("good morning");
  }
  public void afternoon()
  {
	  System.out.println("good afternoon");
  }
  public void evening()
  {
	  System.out.println("good evening");
  }
  public void night()
  {
	  System.out.println("good night");
  }
}
class Hindi implements Greetings
  {
    public void morning()
    {
  	  System.out.println("shubodhaya");
    }
    public void afternoon()
    {
  	  System.out.println("shubhdopohar");
    }
    public void evening()
    {
  	  System.out.println("shubsandhya");
    }
    public void night()
    {
  	  System.out.println("shubratri");
    }
  }
class Telugu implements Greetings
    {
      public void morning()
      {
    	  System.out.println("Namaskaram");
      }
      public void afternoon()
      {
    	  System.out.println("Namaskaram");
      }
      public void evening()
      {
    	  System.out.println("Namaskaram");
      }
      public void night()
      {
    	  System.out.println("Namaskaram");
      }    
    }