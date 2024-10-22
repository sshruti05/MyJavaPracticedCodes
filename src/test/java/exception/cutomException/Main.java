package exception.cutomException;

public class Main  {

	public static void main(String[] args) {
		int responseCode = 300; //response.getStatusCode
		try {
			if ( responseCode != 200) {
				throw new ResponseCodeException("Wrong status code "+responseCode);
			}
		}
		catch(ResponseCodeException e) {
			e.printStackTrace();
		}

	}

}
