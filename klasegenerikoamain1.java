package ebaluaketa3;

import ebaluaketa2.ClaseGenerica;

public class klasegenerikoamain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String katea1="Astelehena";
		String katea2="Asteartea";
		String katea3="Asteazkena";
		int znbk1=10;
		int znbk2=20;
		int znbk3=30;
		double pi=3.14;
		double e=2.7182;
		
		
		
		klasegenerikoa1<String> kg1=new klasegenerikoa1<String>("Astelehena");
		klasegenerikoa1<String> kg2=new klasegenerikoa1<String>(katea2);
		klasegenerikoa1<String> kg3=new klasegenerikoa1<String>(katea3);
		klasegenerikoa1  kg4=new klasegenerikoa1  (znbk1);
		klasegenerikoa1  kg5=new klasegenerikoa1<Integer> (znbk2);
		klasegenerikoa1 <Integer> kg6=new klasegenerikoa1 (znbk3);
		klasegenerikoa1 <Double> kg7=new klasegenerikoa1<Double> (pi);
		klasegenerikoa1 <Double> kg8=new klasegenerikoa1<Double> (e);
		
		kg1.idatzi();
		kg2.idatzi();
		kg3.idatzi();
		kg4.idatzi();
		kg5.idatzi();
		kg6.idatzi();
		kg7.idatzi();
		kg8.idatzi();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	
	
	

	}
}
