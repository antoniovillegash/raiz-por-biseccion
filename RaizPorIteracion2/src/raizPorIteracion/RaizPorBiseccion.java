package raizPorIteracion;

public class RaizPorBiseccion {
	public static double Funcion(double coeficiente1,double coeficiente2,double coeficiente3,double coeficiente4,double coeficiente5,double coeficiente6,double constante, double x){

		return(coeficiente6*Math.pow(x, 6))+(coeficiente5*Math.pow(x, 5))+(coeficiente4*Math.pow(x, 4))+
				(coeficiente3*Math.pow(x, 3))+(coeficiente2*Math.pow(x, 2))+(coeficiente1*Math.pow(x, 1))+constante;
	}

	public static double PuntoMedio(double a, double b) {
		return(a+b)/2;
	}
	public static void main(String[] args) {
		int cantDecimales=0;
		double a=0;
		double b=10;
		double pm=0;
		double error=100;
		double funcionDeA=0;
		double funcionDelPm=0;
		double pmAnterior=0;
		double constante=-4;
		double coeficiente1=-3;
		double coeficiente2=1;
		double coeficiente3=0;
		double coeficiente4=0;
		double coeficiente5=0;
		double coeficiente6=0;
		double porcentError=.0293;
		boolean segundaIteracion=false;
		
		while(Math.abs(error)>Math.abs(porcentError)){
			pm=(a+b)/2;
			
			funcionDeA=(Funcion(coeficiente1, coeficiente2, coeficiente3, coeficiente4, coeficiente5, coeficiente6, constante,  a));;
			funcionDelPm=(Funcion(coeficiente1, coeficiente2, coeficiente3, coeficiente4, coeficiente5, coeficiente6, constante,  pm));;
			if(funcionDeA*funcionDelPm==0) {
				System.out.println("se encontró la raíz");
			}else if(funcionDeA*funcionDelPm<0) {
				if(segundaIteracion) {
					error=((Math.abs(pm)-Math.abs(pmAnterior))/Math.abs(pm))*100;
				}
				b=pm;
			}else{
				if(segundaIteracion) {
					error=((Math.abs(pm)-Math.abs(pmAnterior))/Math.abs(pm))*100;
				}
				a=pm;
			}
			segundaIteracion=true;
			pmAnterior=pm;
			System.out.println("a:"+a+" b:"+b+ " pm:"+pm+" error:"+error );
		}

	}

}
