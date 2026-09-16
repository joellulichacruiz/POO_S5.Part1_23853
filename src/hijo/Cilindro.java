package hijo;
import padre.Círculo;
public class Cilindro extends Círculo {
private double altura;
double pi=Math.PI;
public Cilindro(double radio, double altura) {
	super(radio);
	this.altura = altura;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public String Mensaje() {
	return "Soy cilindro";
}
public double Área() {
	return 2*super.Área()+2*pi*radio*altura;
}
public double Volumen() {
	return pi*radio*radio*altura;
}
}
