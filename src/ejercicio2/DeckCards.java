package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		// Array que contiene los cuatro palos de la baraja
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		// Array que contiene los 13 valores posibles de las cartas
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		// Creamos una lista dinámica donde guardaremos las cartas
		ArrayList<Card> deck = new ArrayList<Card>();
		// Recorre todos los palos de la baraja
		for (int i = 0; i < suits.length; i++) {
			// Recorre todos los valores de las cartas
			for (int j = 0; j < values.length; j++) {
				// Creamos una carta combinando el palo y el valor correspondiente
				Card card = new Card(suits[i], values[j]);
				// Añadimos la carta creada a la lista de la baraja
				deck.add(card);
			}
		}
		// Recorremos todas las cartas para mezclarlas aleatoriamente
		for (int i = 0; i < deck.size(); i++) {
			// Recorremos todas las cartas para mezclarlas aleatoriamente
			int j = (int) Math.floor(Math.random() * i);
			// Guardamos temporalmente la carta de la posicion i
			Card tmp = deck.get(i);
			// Colocamos la carta de la posicion j en la posicion i
			deck.set(i, deck.get(j));
			// Colocamos la carta guardada temporalmente en la posicion j
			deck.set(j, tmp);
		}
		// Mostramos por pantalla las primera 5 cartas de la baraja
		for (int i = 0; i < 5; i++) {
			// Imprimimos la carta correspondiente
			System.out.println(deck.get(i));
		}

	}

}
