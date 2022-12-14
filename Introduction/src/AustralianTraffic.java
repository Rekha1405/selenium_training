
public class AustralianTraffic implements Centraltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Centraltraffic a = new AustralianTraffic();
    a.redStop();
    a.flashYellow();
    a.greenGo();
    AustralianTraffic at = new AustralianTraffic();
    at.walkonsymbol();
	}

	
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementations.");
	}
	
	public void walkonsymbol() {
		System.out.println("walking.");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implementations.");	
	}


	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementations.");	
	}

}

