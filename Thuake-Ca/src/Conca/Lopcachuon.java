package Conca;

public class Lopcachuon extends Lopca {

	double tocdo;
	public Lopcachuon(String tenCa, double canNang, String mauSac, boolean covay, double tocdo) {
		super(tenCa, canNang, mauSac, covay);
		// TODO Auto-generated constructor stub
		this.tocdo=tocdo;
	}
	@Override public void InThongTin() {
		super.InThongTin();
		System.out.println("Bo xa  "+
                tocdo);
	};
	@Override
	public void CachBoi() {
		// TODO Auto-generated method stub
		System.out.println("Boi kieu Ca heo !!!");
	}

}
