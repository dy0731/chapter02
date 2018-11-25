package chapter2;

public class TV {
	
	private boolean power;
	private int channel;
	private int volume;
	
	//기본생성자 (디폴트 값을 생성자 오버로딩 메서드를 이용한다.)
	public TV() {
		this(6,11,false);
	}
	
	//생성자 오버로딩
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//채널변경 (채널로 직접)
	public void channel(int number) {
		
		if(number < 1) {
			number = 255;
		} else if(number > 255) {
			number = 1;
		}
		
		this.channel = number;
	}
	
	//채널변경 (위, 아래). 오버로딩 메서드를 이용한다.
	public void channel(boolean up) {
		int channel = this.channel;
		
		if(up) {
			channel++;
		} else {
			channel--;
		}
		
		this.channel(channel);
	}
	
	//전원 설정
	public void power(boolean on) {
		this.power = on;
	}
	
	//볼륩설정 (직접 설정)
	public void volume(int volume) {
		
		if(volume < 0) {
			volume = 0;
		} else if(volume > 110) {
			volume = 110;
		}
		
		this.volume = volume;
	}
	
	//볼륨설정 (위, 아래), 오버로딩 메소드를 이용한다.
	public void volume(boolean up) {
		int volume = this.volume;
		
		if(up) {
			volume++;
		} else {
			volume--;
		}
		
		this.volume(volume);
	}
	
	//상태표시
	public void status() {
		System.out.println("TV[power=" + power + ", channel=" + channel + ", volume=" + volume + "]");
	}
}
