package view;
import controller.SomatoriaFatorialController;

public class SomatoriaFatorial
{
public static void main(String Args[])
 {
 SomatoriaFatorialController SomaFat = new  SomatoriaFatorialController();
 int numero = 5;
 double serie = SomaFat.RecSomaFat(numero);
 System.out.println(serie);
 }
}
