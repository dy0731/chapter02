package chapter2;

public class TV {
	
	private boolean power;
	private int channel;
	private int volume;
	
	public TV() {
		this(6,11,false);
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void channel(int number) {
		
		if(number < 1) {
			number = 255;
		} else if(number > 255) {
			number = 1;
		}
		
		this.channel = number;
	}
	
	public void channel(boolean up) {
		int channel = this.channel;
		
		if(up) {
			channel++;
		} else {
			channel--;
		}
		
		this.channel(channel);
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void volume(int volume) {
		
		if(volume < 0) {
			volume = 0;
		} else if(volume > 110) {
			volume = 110;
		}
		
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		int volume = this.volume;
		
		if(up) {
			volume++;
		} else {
			volume--;
		}
		
		this.volume(volume);
	}
	
	public void status() {
		System.out.println("TV[power=" + power + ", channel=" + channel + ", volume=" + volume + "]");
	}
}
