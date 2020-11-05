import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import RMI.IBanqueRemote;
import metier.Compte;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			IBanqueRemote stub=(IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.conversio(9000));
			System.out.println("Consultation d'un compte a distance");
			Compte cp=stub.consulterCompte(1);
			System.out.println("Code="+cp.getCode());
			System.out.println("Solde="+cp.getSolde());
			System.out.println("date:"+cp.getDateCreation());
			System.out.println("Consultaion des comptes");
			List<Compte> cptes=stub.ListComptes();
			for(Compte c:cptes) {
				System.out.println("--------------------------");
				System.out.println("Code="+cp.getCode());
				System.out.println("Solde="+cp.getSolde());
				System.out.println("date:"+cp.getDateCreation());
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}

}
	}
