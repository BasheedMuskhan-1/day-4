package com.inter;

public interface IBook
{
	public int daysOverDue(int day);
	public boolean isOverDue(int due);
	public void computeFine(int day);
}

  class RegularBook implements IBook
{
	String title;
	String author;
	int intDayTaken;
	public RegularBook(String title,String author,int intDayTaken)
	{
		this.title=title;
		this.author=author;
		this.intDayTaken=intDayTaken;
	}
	public int daysOverDue(int day)
	{
		int today=12;
		int overDue=today-day;
		int overDue1=overDue+1;
		
		if(overDue<0)
		{
			return overDue1;
		}          
		else
		{
			return overDue1;
		}
	}
	
	public boolean isOverDue(int due)
	{
		if(due>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void computeFine(int day)
	{
		int d=daysOverDue(day);
		boolean status=isOverDue(d);
		int fine=0;
		int borrowDays=day-intDayTaken; 
		
		if(status==true && borrowDays>12)
		{
			fine=d*10;
		}
		System.out.println("total fine "+fine);
	}
}

	class ReferenceBook implements IBook
	{
	    String title;
		String author;
		int intDayTaken;
		public ReferenceBook(String title,int intDayTaken)
		{
			this.title=title;
			this.intDayTaken=intDayTaken;
		}
		public int daysOverDue(int day)
		{
			int today=12;
			int overDue=today-day;
			int overDue1=overDue+1;
			
			if(overDue<0)
			{
				return overDue1;
			}          
			else
			{
				return overDue1;
			}
		}
		public boolean isOverDue(int due)
		{
			if(due>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public void computeFine(int day)
		{
			int d=daysOverDue(day);
			boolean status=isOverDue(d);
			int fine=0;
			int borrowDays=day-intDayTaken; 
			
			if(status==true && borrowDays>2)
			{
				fine=d*10;
			}
			System.out.println("total fine "+fine);
		}
	}

	class AudioBook implements IBook
	{
	    String title;
		String author;
		int intDayTaken;
		public AudioBook(String title,String author,int intDayTaken)
		{
			this.title=title;
			this.author=author;
			this.intDayTaken=intDayTaken;
		}
		public int daysOverDue(int day)
		{
			int today=12;
			int overDue=today-day;
			int overDue1=overDue+1;
			
			if(overDue<0)
			{
				return overDue1;
			}          
			else
			{
				return overDue1;
			}
		}
		public boolean isOverDue(int due)
		{
			if(due>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public void computeFine(int day)
		{
			int d=daysOverDue(day);
			boolean status=isOverDue(d);
			int fine=0;
			int borrowDays=day-intDayTaken; 
			
			if(status==true && borrowDays>12)
			{
				fine=d*20;
			}
			System.out.println("total fine "+fine);
		}
	}
	class MainBook
	{
		public static void main(String args[])
		{
			IBook ib=new RegularBook("disney world","disney",4);
			ib=computeFine(14);
			
			IBook ib1=new ReferenceBook("publication manual",6);
			ib1=computeFine(10);
			
			IBook ib2=new AudioBook("handbook",4);
			ib2=computeFine(14);
			
		}
	}