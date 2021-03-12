package mediator;

public class BasicUser implements IUser {

	IChatMediator icm;
	String name;
	
	public BasicUser(IChatMediator icm, String name) {
		super();
		this.icm = icm;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String message) {
		System.out.println(this.name+":Received Message:" +message);
	}

	@Override
	public void SendMessage(String message) {
		System.out.println(this.name+":Sending Message="+message+"\n");
		icm.SendMessage(message, this);

	}

}
