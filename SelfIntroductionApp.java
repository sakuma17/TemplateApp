import java.util.*;
public class SelfIntroductionApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Template[] data={
			new Furuya("ふるや"),
			new Hayasaka("はやさか"),
			new Hirose("ひろせ"),
			new Kano("かの"),
			new Matsuo("まつお"),
			new Nakamichi("なかみち"),
			new Nomoto("のもと"),
			new Sakuma("さくま"),
			new Sato("さとう"),
			new Takeda("たけだ"),
			new Tokuda("とくだ"),
			new Fujimura("ふじむら")
		};
		for(Template temp:data){
			temp.introduce();
			sc.nextLine();	
		}
	}
}
