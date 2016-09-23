package Conca;

public abstract class Lopca {
	 String tenCa;
     double canNang;
     String mauSac;
     boolean covay ;
     public Lopca(String tenCa,
     double canNang,
     String mauSac,
     boolean covay)
     {
         this.tenCa = tenCa;
         this.canNang = canNang;
         this.mauSac = mauSac;
         this.covay = covay;
     }
     public void InThongTin()
     {
         System.out.println("Ten Ca: "+ tenCa);
         System.out.println("Can nang: "+
             canNang);
         System.out.println("Mau sac: "+ mauSac);
         if(covay==false)
         System.out.println("Loai ca: da tron"); 
         else System.out.println("Loai ca: co vay");
             
     }
     public abstract void CachBoi();
}
