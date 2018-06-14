package ru.example.part1;
/**
* Class для вывода на экран песенки о бутылках пиво
* @author spartakzubenok
* @since 10.06.2018
* @version 1
*/
public class BeerSong {
	public static void main(String[] args) {
	int beerNum=7;
	String word="бутылок (бутылки)";
	
	while(beerNum>0) {
		if(beerNum==1) {
			word="бутылка";
		}
		System.out.println(beerNum+""+word+"_пива на столе");
		System.out.println(beerNum+""+word+"_пива");
		System.out.println("Возьми одну!!!");
		System.out.println("Пусти по кругу!!!");
		beerNum=beerNum-1;
	}
	System.out.println("Нет бутылок пива на столе");
	}
/**
* вывод на экран текста до момента соответствия условию
* @param beerNum переменная
* @return текст на экране
*/
}