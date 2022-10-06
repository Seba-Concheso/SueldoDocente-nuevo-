package SueldoDocente;
import java.util.*;
public class SueldoDocente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Antiguedad=new Scanner(System.in);
		Scanner CargoDocente=new Scanner(System.in);
		
		float docente=500;
		float ayudante=350;
		//int ant=0;
		System.out.println("Ingrese cargo:  1-Docente       2-Ayudante");
		int cargo=CargoDocente.nextInt();
		System.out.println("Ingrese antiguedad");
		int ant=Antiguedad.nextInt();
		if(cargo==1) {
			if(ant<5) {
				float pago=docente;
				System.out.println("El sueldo a cobrar es:  "+ pago);
			}
			else {
				if(ant<7) {
					float pago= docente+(docente*3/100);
					System.out.println("El sueldo a cobrar es:  "+ pago);
				}
				else {
					if(ant<10) {
						float pago= docente +(docente*5/100);
						System.out.println("El sueldo a cobrar es:  "+ pago);
					}
					else {
						float pago= docente +(docente*8/100);
						System.out.println("El sueldo a cobrar es:  "+ pago);
					}
				}
			}
		}
		else {
			if(ant<5) {
				System.out.println("El sueldo a cobrar es:  "+ ayudante);
			}
			else {
				if(ant<7) {
					float pago= ayudante+(ayudante*3/100);
					System.out.println("El sueldo a cobrar es:  "+ pago);
				}
				else {
					if(ant<10) {
						float pago= ayudante +(ayudante*5/100);
						System.out.println("El sueldo a cobrar es:  "+ pago);
					}
					else {
						float pago= ayudante +(ayudante*8/100);
						System.out.println("El sueldo a cobrar es:  "+ pago);
					}
				}
			}
		}
		
		
	}

}
