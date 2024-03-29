package temperature;

public class TemperatureController {
	private TemperatureModel model ;
	private TemperatureVue view = null ;
	private ModifieTemperature modtemp;
	public TemperatureController ( TemperatureModel m) {
	model = m;
	}
	public void augmenteDegresC (){
	model . setC ( modtemp . augmenteDegres ( model . getC ()));
	control ();
	}
	public void diminueDegresC (){
	model . setC ( modtemp . diminueDegres ( model . getC ()));
	control ();
	}
	public void fixeDegresC ( double tempC ){
	model . setC ( tempC );
	control ();
	}
	public void augmenteDegresF (){
	model . setF ( modtemp . augmenteDegres ( model . getF ()));
	control ();
	}
	public void diminueDegresF (){
	model . setF ( modtemp . diminueDegres ( model . getF ()));
	control ();
	}
	public void fixeDegresF ( double tempF ){
	model . setF ( tempF );
	control ();
	}
	public void control () {
	if ( view != null ) {
	if ( model . getC () > 40.0) {
	view . enableWarningColor ();
	} else {
	view . disableWarningColor ();
	}
	}
	}
	public void addView ( TemperatureVue view ) {
	this . view = view ;
	}
	}



