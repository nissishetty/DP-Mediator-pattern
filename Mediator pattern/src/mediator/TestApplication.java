package mediator;

public class TestApplication {

	public static void main(String[] args) {

		IChatMediator iChatMediator = new ChatMediator();
		IUser nissi = new BasicUser(iChatMediator,"Nissi");
		IUser tridha = new BasicUser(iChatMediator,"Tridha");
		IUser amith = new BasicUser(iChatMediator, "Amith");
		IUser dolly = new PremiumUser(iChatMediator, "dolly");
		IUser thor = new PremiumUser(iChatMediator, "Thor");
		
		iChatMediator.AddUser(nissi);
		iChatMediator.AddUser(tridha);
		iChatMediator.AddUser(amith);
		iChatMediator.AddUser(dolly);
		iChatMediator.AddUser(thor);
		
		
		tridha.SendMessage("Hello Guys");
	}

}
