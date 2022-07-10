package test;

import java.io.FileNotFoundException;

import food.Drink;
import system.Config;

public class FoodTest {
	public static void main(String[] args) throws FileNotFoundException{
		Drink d = new Drink();
		Config.process(d.queryStr(), d.getName());
	}
}
