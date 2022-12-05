package day09.mythread;
/*
 * synchronized - 동기화를 시켜주는 예약어
 * synchronized를 안하면 sister와 brother가 너무 빠른 속도로 돈을 뺴가는데 프로그램이 횟수를 먹어서 뺴간 합이 10002이나 10001이 될 수도 있음
 */
public class Wallet {
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// Thread safe 메소드
	public synchronized int getMoney() {
		if(totalMoney == 0)
			return 0;
		totalMoney = totalMoney - 1;
		System.out.println("현재 지갑의 금액: " + totalMoney);
		return 1;
	}
}
