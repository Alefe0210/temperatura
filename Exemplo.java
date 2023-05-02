
package Temperatura;

public class Exemplo {
    
    public static void main(String[] args) {
        double celsius = 20;
        double fahrenheit = ConversaoDeUnidadesDeTemperatura.celsiusParaFahrenheit(celsius);
        double kelvin = ConversaoDeUnidadesDeTemperatura.celsiusParaKelvin(celsius);
        double reaumur = ConversaoDeUnidadesDeTemperatura.celsiusParaReaumur(celsius);
        
        System.out.println(celsius + " graus Celsius equivalem a:");
        System.out.println(fahrenheit + " graus Fahrenheit");
        System.out.println(kelvin + " graus Kelvin");
        System.out.println(reaumur + " graus Réaumur");
    }
}
