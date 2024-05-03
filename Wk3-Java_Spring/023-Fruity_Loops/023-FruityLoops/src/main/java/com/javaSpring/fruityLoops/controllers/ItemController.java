package com.javaSpring.fruityLoops.controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaSpring.fruityLoops.models.Item;

@Controller
public class ItemController {

	@RequestMapping("/")
	public String index(Model model) {

		ArrayList<Item> fruitsBasket = new ArrayList<Item>();
		fruitsBasket.add(new Item("Kiwi", 1.5));
		fruitsBasket.add(new Item("Mango", 2.0));
		fruitsBasket.add(new Item("Goji Berries", 4.0));
		fruitsBasket.add(new Item("Guava", .75));
		fruitsBasket.add(new Item("Strawberry", 2.25));
		fruitsBasket.add(new Item("Banana", 0.25));
		fruitsBasket.add(new Item("Apple", 1.85));
		fruitsBasket.add(new Item("Blackberries", 4.75));
		// System.out.println(fruitsBasket); <= printed out as objects within an
		// ArrayList

		System.out.println("\n========= Fruit Store =========\n");
		String div = "+-----------------------------+";
		System.out.println(div);
		System.out.printf("| %-2s | %-12s | %-7s |\n", "#", "Name", "Price");
		System.out.println(div);

		for (int i = 0; i < fruitsBasket.size(); i++) {
			Item fruit = fruitsBasket.get(i);
			DecimalFormat decimalFormat = new DecimalFormat("#0.00");
			String formattedPrice = decimalFormat.format(fruit.getPrice());

			System.out.printf("| %2s | %-12s | %2s%5s |\n", i + 1, fruit.getName(), "$", formattedPrice);
		}
		System.out.println(div);

		// Model JSP variable method variable
		model.addAttribute("fruits", fruitsBasket);

		return "index.jsp";
	}
}