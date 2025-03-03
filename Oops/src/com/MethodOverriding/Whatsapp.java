package com.MethodOverriding;

class WhatsApp_1 {
	void sent()
	{
		System.out.println("Single Tick");
	}
}

class WhatsApp_2 extends WhatsApp_1{
	@Override
	protected void sent()
	{
		System.out.println("Double Tick");
	}
	
	void voiceNote()
	{
		System.out.println("voice MSG");
	}
}

class WhatsApp_3 extends WhatsApp_2 {
	@Override
	public void sent()
	{
		System.out.println("Double blue Tick");
	}
	
	public void videoCall()
	{
		System.out.println("Normal video call");
	}
	@Override
	void voiceNote()
	{
		System.out.println("voice MSG improved");
	}
	
}

class WhatsApp_4 extends WhatsApp_3 {
	@Override
	public void videoCall()
	{
		System.out.println("HD video call");
	}
}


public class Whatsapp {
	public static void main(String[] args)
	{
		WhatsApp_4 w = new WhatsApp_4();
		w.sent();
		w.voiceNote();
		w.videoCall();
	}

}
