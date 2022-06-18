package tv;

public class TvClass {

	int channel=0;
	int volume =0;
	boolean tvon=false;
	
	public void tvOn()
	{
		tvon=true;
	}
	public void tvOff()
	{
		tvon=false;
	}
	public void setchannel (int newchannel)
	{
		if(tvon && newchannel>=1&&newchannel<=120)
			channel=newchannel;
	}
	public void setvolume (int newvolume)
	{
		if(tvon && newvolume>=1&&newvolume<=50)
			volume=newvolume;
	}
	public void volumeup()
	{
		if(tvon)
			volume=volume+1;
	}
	public void channelup()
	{
		if(tvon)
			channel=channel+1;
	}

}
 