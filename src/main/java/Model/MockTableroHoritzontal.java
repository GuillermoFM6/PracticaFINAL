package Model;

public class MockTableroHoritzontal {
	private  char[][] tauler; 
	public MockTableroHoritzontal() {
		ConnectaQuatre c4 =new ConnectaQuatre(5, 9);
		 for(int j=0;j<c4.getAmplada();j++) {
			  c4.getTauler()[0][j]='H';
		 }
		this.tauler=c4.getTauler();
	}
	public char [][] getTauler(){return tauler;}
}
