package ejercicio2;

public class Card {
	// Atributo que almacena el palo de la carta
	public String suit;
	// Atributo que almacena el valor de la carta
	public String value;

	// Constructor de la clase Card, recibe el palo y el valor de l carta
	public Card (String suit, String value) {
		// Asigna el palo recibido al atributo de la clase
		this.suit = suit;
		// Asigna el valor recibido al atributo de la clase
		this.value = value;
	}

	// Método que devuelve una representación de la carta en forma de texto
	public String toString () {
		// Devuelve el palo y el valor separadps por un guión
		return (this.suit+"-"+this.value);
	}
}
