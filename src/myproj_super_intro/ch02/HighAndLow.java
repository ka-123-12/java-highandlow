package myproj_super_intro.ch02;

import java.util.Random;
import java.util.Scanner;


public class HighAndLow {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scr = new Scanner(System.in);
		
		System.out.println("*** High & Low ゲーム ***");
		System.out.println("1~9のカードで遊びます！");
		
		int leftCard = rand.nextInt(9)+1;
		boolean playing = true;
		
		while(playing) {
			System.out.println("【問題】");
			System.out.println("*******" + "      *******");
			System.out.println("*     *" + "      *     *");
			System.out.println("*  " + leftCard +"  *" + "      *  ?  *");
			System.out.println("*     *" + "      *     *");
			System.out.println("*******" + "      *******");
			System.out.println("次のカードはHigh(h)?Low(l)? >");
			String choice = scr.nextLine().toLowerCase();
			

		
		
		if(choice.equals("h")) {
			System.out.println("→Highを選択しました！");
		}else {
			System.out.println("→Lowを選択しました！");
		}
		
		int rightCard = rand.nextInt(9)+1;
		System.out.println("【結果】");
		System.out.println("*******" + "      *******");
		System.out.println("*     *" + "      *     *");
		System.out.println("*  " + leftCard +"  *" + "      *  " + rightCard +"  *");
		System.out.println("*     *" + "      *     *");
		System.out.println("*******" + "      *******");
		
		
		if(rightCard==leftCard) {
			System.out.println("→You Win!");
		}else if((choice.equals("h") && rightCard > leftCard)||
				 (choice.equals("l") && rightCard < leftCard)) {
			System.out.println("→You Win!");
		}else {
			System.out.println("→You Lose...");
			playing = false;
		}
		
	}
		System.out.println("ゲーム終了！");
}
}