package mediator;

public class PremiumUser implements IUser {

	IChatMediator icm;
	String name;

	public PremiumUser(IChatMediator icm, String name) {
		super();
		this.icm = icm;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String message) {
		// TODO Auto-generated method stub

		System.out.println(this.name + ":Received Message:" + message);
	}

	@Override
	public void SendMessage(String message) {
		// TODO Auto-generated method stub

		System.out.println(this.name + ":Sending Message=" + message + "\n");
		icm.SendMessage(message, this);
	}

}
