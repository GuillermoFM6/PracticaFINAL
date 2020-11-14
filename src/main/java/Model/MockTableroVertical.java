package Model;

public class MockTableroVertical {
	private  char[][] tauler; 
	public MockTableroVertical() {
		ConnectaQuatre c4 =new ConnectaQuatre(5, 9);
		for(int j=0;j<c4.getAltura();j++) {
			  c4.getTauler()[j][0]='H';
		 }
		this.tauler=c4.getTauler();
	}
	public char [][] getTauler(){return tauler;}

}
