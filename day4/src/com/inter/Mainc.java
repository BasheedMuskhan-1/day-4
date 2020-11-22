package com.inter;


class University
{
	String pname="Mus";
	public void fee()
	{
		System.out.println("fee is 45000");
	}
	static class Electrical
	{
		String hodname="Lalitha";
		public static void dance()
		{
			System.out.println("she is talking");
		}
		}
	public class CompScience
	{
		int sub=5;
		public void read()
		{
			System.out.println("read 5 subjects");
		}
		}
	class Mechanical
	{
		int branch=1;
		public void play()
		{
			System.out.println("play cricket");
		}
		}
}

public class Mainc
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           University u=new University();
           System.out.println(u.pname);
           u.fee();
           University.Electrical e=new University.Electrical();
           System.out.println(e.hodname);
           University.Electrical.dance();
           University.CompScience c=u.new CompScience();
           c.read();
           System.out.println(c.sub);
           University.Mechanical m=u.new Mechanical();
           m.play();
           System.out.println(m.branch);
           }
}

           
