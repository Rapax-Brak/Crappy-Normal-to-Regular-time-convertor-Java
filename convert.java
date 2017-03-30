public class convert {
	private int hour;
	private int minute;
	private int second;
	int time;
	public void setTime(int h, int m, int s, int pmoam) {
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
		if (pmoam == 1) {
			time = ((h*100) + m);
					if (s == 60) {
						m += 1;
						time = ((h*100)) + m;
					}
		}else {
			time = ((h*100) + 1200) + m;
			if (s == 60) {
				m += 1;
				time = ((h*100) + 1200) + m;
			}
		}
	}
	
	public int toMill() {
		
		return time;
	}
}
