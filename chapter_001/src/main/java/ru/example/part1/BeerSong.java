package ru.example.part1;
/**
* Class to display a song about bottles of beer
* @author spartakzubenok
* @since 10.06.2018
* @version 1
*/
public class BeerSong {
	public static void main(String[] args) {
	int beerNum=7;
	String word="bottles";
	
	while(beerNum>0) {
		if(beerNum==1) {
			word="bottle";
		}
		System.out.println(beerNum+""+word+"_beer on the table");
		System.out.println(beerNum+""+word+"_beer");
		System.out.println("Take one!!!");
		System.out.println("Let's go in a circle!!!");
		beerNum=beerNum-1;
	}
	System.out.println("No bottles of beer on the table");
	}
/**
* Display the text until it meets the condition
* @param beerNum variable
* @return text on the screen
*/
}