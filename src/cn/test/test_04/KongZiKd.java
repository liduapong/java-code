package cn.test.test_04;
// 孔子坑爹案例
public class KongZiKd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KongZiDie kd = new KongZi();
		System.out.println(kd.age);
		kd.teach();
		
		KongZi k = (KongZi)kd;
		System.out.println(k.age);
		k.playGame();
	}

}
class KongZiDie{
	public int age = 40;
	public void teach() {
		System.out.println("讲解javase");
	}
	
}
class KongZi extends KongZiDie{
	public int age = 10;
	public void teach() {
		System.out.println("讲解论语");
	}
	public void playGame() {
		System.out.println("英雄联盟");
	}
}