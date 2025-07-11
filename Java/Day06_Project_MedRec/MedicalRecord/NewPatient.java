import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NosuchAlgorithmException;

class NewPatient {
	public static Patient registerNewPatient() {
		Scanner sc = new Scanner(System.in);
		System.out.print("FirstName: ");
		Patient.fName = sc.nextLine();
		
	}

	public static String hash_SHA256(String text) {
		/
	}
}
