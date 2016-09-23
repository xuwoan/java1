package Conca;

public class Lopcabaymau extends Lopca {
int somau;
	public Lopcabaymau(String tenCa, double canNang, String mauSac,
			boolean covay, int somau) {
		super(tenCa, canNang, mauSac, covay);
		// TODO Auto-generated constructor stub
		this.somau=somau;
	}
	@Override public void InThongTin() {
		super.InThongTin();
		System.out.println("So mau: "+somau);
    };
	
	@Override
	public void CachBoi() {
		// TODO Auto-generated method stub
		System.out.println("Boi kieu ChaChaCha....");
	}

}
