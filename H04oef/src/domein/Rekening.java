package domein;

public class Rekening {

	private long rekeningNummer;
	private double saldo;
	private String naamHouder;
	
	public Rekening() {
		this(123456789, "onbekend");
	}
	
	public Rekening(long rekeningNummer) {
		this(rekeningNummer, "onbekend");
	}
	
	public Rekening(long rekeningNumer, String naamHouder) {
		setRekeningNummer(rekeningNumer);
		setNaamhouder(naamHouder);
	}
	public long getRekeningNummer() {
		return rekeningNummer;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNaamHouder() {
		return naamHouder;
	}
	
	public void setNaamhouder(String naamHouder) {
		this.naamHouder = naamHouder;
	}
	
	private void setRekeningNummer(long rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}
	
	public boolean stort(double bedrag) {
		
	}
	
	public boolean haalAf(double bedrag) {
		
	}
	
	
}
