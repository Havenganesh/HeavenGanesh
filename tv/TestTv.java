package tv;

import java.util.Date;

public class TestTv {

	public static void main(String[] args) 
	{
		TvClass tv =new TvClass();
		tv.tvOn();
		tv.setvolume(15);
		tv.setchannel(2);
		int testchannel=tv.channel;
		TvClass mitv;
		mitv=new TvClass();
		mitv.tvOn();
		mitv.setchannel(25);
		System.out.println(mitv.channel);
		System.out.println(testchannel);
		System.out.println(tv.volume+" "+tv.channel+" "+tv.tvon);
		Date date = new Date();
		System.out.println( date.getTime());
		System.out.println(date.toString());
		
	}

}
