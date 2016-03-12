public class Stasiun{
	private String KodeStasiun;
	private String NamaStasiun;
	
	public Stasiun(String kodeStasiun, String namaStasiun){
		this.KodeStasiun=kodeStasiun;
		this.NamaStasiun=namaStasiun;
	}
	public void setKodeStasiun(String kodeStasiun){
		this.KodeStasiun=kodeStasiun;
	}
	
	public void setNamaStasiun(String namaStasiun){
		this.NamaStasiun=namaStasiun;
	}
	
	public String getKodeStasiun(){
		return KodeStasiun;
	}
	
	public String getNamaStasiun(){
		return NamaStasiun;
	}
}