package ua.lviv.iot.toolsforcleaning.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.toolsforcleaning.seller.HouseholdChemicalsSellerImpl;

public class Main {

	public static void main(String[] args) {
		HouseholdChemicalsSellerImpl seller = new HouseholdChemicalsSellerImpl();
		seller.setHouseholdChemical();

		System.out.print(seller.findingOfBlightyGoods(true));
		System.out.println();

		System.out.print(seller.sortByPrice(true));
		System.out.println();

		System.out.print(seller.findingOfIndoorChemicals(true));
		System.out.println();

	}

}
