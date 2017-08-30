package Polymorphism;

class Product{
	int price;
	int bonusPoint;
	final float bonusPointRate;
	public Object length;
	{
		bonusPointRate = 0.1f;
	}
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price*bonusPointRate);
	}
}
/*  제품 에 대한 클래스  */


class TV extends Product{
	TV(){
		super(100);
	}
	
	public String toString(){
		return "TV";
	}
}
/* 티비에 대한 클래스  */


class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}
/*  컴퓨터에 대한 클래스  */


class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}
/*  오디오에 대한 클래스  */

class Buyer{
	int money;
	int bonusPoint;
	Product cart[];
	int cartIndex;
	
	Buyer(){
		money = 1000;
		cart	    = new Product[10];
	}
	Buyer(int money,int cartNum){
		this.money 	= money;
		cart				= new Product[cartNum];
	}
	
	void buy(Product p){
		this.money = this.money - p.price;
		this.bonusPoint = p.bonusPoint;
		this.cart[cartIndex++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	void summary(){
		int sum = 0;
		String itemList = "";
		
		for(int i = 0;i < this.cartIndex; i++){
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		
		System.out.println("구입하신 물품의 총 금액: " +sum +"만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다. ");
	}
}
/*  구매자에 대한 클래스  */



public class PolymorphismExample {
	public static void main(String[] args){
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		Buyer buyer = new Buyer(5000,10);
		
		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(audio);
		
		buyer.summary();
	}
}
