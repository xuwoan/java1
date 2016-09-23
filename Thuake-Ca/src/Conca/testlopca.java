package Conca;

import java.util.Scanner;

public class testlopca {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc;
		// TODO Auto-generated method stub
		double cannang;
		//lamlai :
		System.out.println("chon lai ca 1: bay mau , 2 : ca tre , 3: ca chuon");
		int loaica;
        sc = new Scanner(System.in);
        loaica = sc.nextInt();
        System.out.println(" ca ");

        switch(loaica)
        {
        case 1:
        	System.out.println(" nhap can nang cua ca ");
        	
        	cannang = sc.nextDouble();
        	System.out.println(" nhap mau ca ");
        	
        	String mau = sc.nextLine();
        	Lopcabaymau bm = new Lopcabaymau("ca tre",cannang,mau,false,7);
    		bm.InThongTin();
    		bm.CachBoi();
        	break;
        case 2:
        	System.out.println(" nhap can nang cua ca ");
        	sc = new Scanner (System.in);
        	cannang = sc.nextDouble();
        	System.out.println(" nhap sokm ");
        	sc = new Scanner (System.in);
        	Double sokm  = sc.nextDouble();
        	Lopcatre ct = new Lopcatre("ca chuon",cannang,"den",true,sokm);
    		ct.InThongTin();
    		ct.CachBoi();
        	break;
        case 3:
        	System.out.println(" nhap can nang cua ca ");
        	sc = new Scanner (System.in);
        	cannang = sc.nextDouble();
        	System.out.println(" nhap toc do ");
        	sc = new Scanner (System.in);
        	Double td  = sc.nextDouble();
        	Lopcatre cc = new Lopcatre("ca bay mau",cannang,"den",false,td);
    		cc.InThongTin();
    		cc.CachBoi();
        	break ;
        default:
        	System.out.println("Nhap so tu 1 den 3...");
        	//continue ;
        	
        }
	}

}
