package Conca;

public class Lopcatre extends Lopca {

	double sokm;
	public Lopcatre(String tenCa, double canNang, String mauSac, boolean covay, double sokm) {
		super(tenCa, canNang, mauSac, covay);
		this.sokm=sokm;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void InThongTin() {
		super.InThongTin();
		System.out.println("Bo xa  km"+
                sokm);
		System.out.println(" Bo kieu ziczac ");
	};
	@Override
	public void CachBoi() {
		System.out.println("Boi kieu Rumba !!!");
		// TODO Auto-generated method stub

	}

}
