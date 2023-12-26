package SkillRack;

public class CountLaterComers {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="10:30 11:09 9:55 10:00";
		String parts[]=input.split(" ");
		int late=0;
		for(String time:parts) {
			String times[]=time.split(":");
			int HH=Integer.parseInt(times[0]);
			int MM=Integer.parseInt(times[1]);
			if(HH>10 || (HH==10 && MM>0)) {
				late++;
			}
		}
		System.out.print(late);

	}
}
