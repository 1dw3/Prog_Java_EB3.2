package ebaluaketa3;

public class klasegenerikoa1 <T> {
	T baliogenerikoa;
	//int a;
	Integer a=0;
	
	public klasegenerikoa1 (T balioa){
	baliogenerikoa=balioa;
	}
	
	/*public klasegenerikoa1 (int balioa){
		baliogenerikoa=balioa;
		}
	*/
	
	public void idatzi(){
		/*if (this.baliogenerikoa.getClass().equals(Integer.class)){
			a=(Integer) this.baliogenerikoa+2;
		}*/
		System.out.println("Hau da atributuaren balioa: "+baliogenerikoa);
		/*System.out.println("Hau da a balioa: "+a);*/
		
	
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
}
