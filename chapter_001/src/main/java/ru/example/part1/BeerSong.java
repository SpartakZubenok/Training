package ru.example.part1;
/**
* Class ��� ������ �� ����� ������� � �������� ����
* @author spartakzubenok
* @since 10.06.2018
* @version 1
*/
public class BeerSong {
	public static void main(String[] args) {
	int beerNum=7;
	String word="������� (�������)";
	
	while(beerNum>0) {
		if(beerNum==1) {
			word="�������";
		}
		System.out.println(beerNum+""+word+"_���� �� �����");
		System.out.println(beerNum+""+word+"_����");
		System.out.println("������ ����!!!");
		System.out.println("����� �� �����!!!");
		beerNum=beerNum-1;
	}
	System.out.println("��� ������� ���� �� �����");
	}
/**
* ����� �� ����� ������ �� ������� ������������ �������
* @param beerNum ����������
* @return ����� �� ������
*/
}