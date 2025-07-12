import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NosuchAlgorithmException;

class NewPatient {
	public static Patient registerNewPatient() {
		Scanner sc = new Scanner(System.in);

		System.out.print("FirstName: ");
		String fName = Sc.nextLine();

		System.out.print("LastName: ");
		String lName = Sc.nextLine();

		System.out.print("Date of Birth (YYYY-MM-DD): ");
		LocalDate dob = LocalDate.parse(sc.nextLine());

		System.out.print("National ID: ");
		String nationalID = sc.nextLine();
		boolean checkIdFormat = false;
		while (!checkIdFormat)
		{
			if (checkIdFormat(nationalID))
			{
				String hashedID = SHA256Hasher.hash(nationalID);
				checkIdFormat = true;
			}
			else
			{
				System.out.print("Invalid format, please re-enter: ");
				nationalID = sc.nextLine();
			}
		}
	}

	public static boolean checkIdFormat(String Id) {
		if (Id.length() != 13)
			return false;
		for (char c : Id.toCharArray()) 
		{
			if (c < '0' && c > '9')
				return false;
		}

		return true;
	}

	public static String SHA256_hash(String text) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
			
			StringBuilder hexString = new StringBuilder(2 *encodedhash.length);
			for (byte b : encodedhash) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			System.err.println("SHA-256 algorithm not found: " + e.getMessage());
			return null;
		}
	}

	private int generateHN() {
		/* Generating HN based on the year */
	} 
}
