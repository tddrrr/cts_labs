package ro.ase.cts.simpleFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			FactoryPersonal factory = new FactoryPersonal(); asta pt cand metoda e non-statica
			PersonalSpital personal1;
			PersonalSpital personal2;
			personal1 = FactoryPersonal.createPersonal(TipPersonal.Medic, "Ion", 1500);
			personal2 = FactoryPersonal.createPersonal(TipPersonal.Asistent, "Maria", 1000);
			System.out.println(personal1);
			System.out.println(personal2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
