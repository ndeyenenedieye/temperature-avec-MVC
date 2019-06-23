package temperature;

public class TemperatureMVC {
	public TemperatureMVC () {
		TemperatureModel tempmod = new TemperatureModel ();
		TemperatureController tempcontrolC = new TemperatureController ( tempmod );
		TemperatureController tempcontrolF = new TemperatureController ( tempmod );
		TemperatureVueCelsuis pvc = new
		
		TemperatureVueCelsuis ( tempmod , tempcontrolC , 100 , 200);
		tempcontrolC . addView (pvc );
		
		}
		public static void main ( String args []) {
		TemperatureMVC m= new TemperatureMVC ();
		System.out.println("afficher la temperature");
		}
	
		}
	




