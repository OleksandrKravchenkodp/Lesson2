package ua.com.hillel.kravchenko.lesson2;

/*
3. Создайте класс House. Заполните Ваш новый дом “мебелью”
(подсказка: мебель - это отдельные классы, то есть внутри дома будут параметры = новые классы), 
для примера достаточно 2-3 вещи/предмета в доме. У каждой вещи также должно быть пару характеристик.
*/

public class House {

	FurnitureForLivingRoom sofa = new FurnitureForLivingRoom ("Yellow", "Big", 50);
	
	FurnitureForBedRoom bed = new FurnitureForBedRoom ();
	
	void livingRoomFurniture () {
		
		System.out.println("Color of sofa: " + sofa.sofaСolor);
		System.out.println("Size of sofa: " + sofa.sofaSize);
		System.out.println("Weight of sofa: " + sofa.sofaWeight);
		
	}
	
	
	void bedRoomFurniture () {
		
		bed.setSizeBed("King Size");
		bed.setColorBed("Brown");
		
		System.out.println("Size of bad: " + bed.getSizeBed());
		System.out.println("Color of bad: " + bed.getColorBed());
		
	}
	
}
