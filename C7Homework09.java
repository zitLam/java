
public class C7Homework09 {

	public static void main (String[] args) {

		Music music = new Music("<������>", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}

class Music {

	String name;
	double times;

	public Music(String name, double times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println(name + "���ڲ�����");
	}

	public String getInfo() {
		return "����:" + name + "  ����ʱ��Ϊ:" + times;
	}
}