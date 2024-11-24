import java.util.Arrays;
import java.util.List;

public class QAJavaCodeVault {

	public static void main(String[] args) {
		//Creating object of a class to call a function in another class
		CompareStrings objCS = new CompareStrings();
		
//		objCS.StringCompareWithAtChar();
		//Using Object to call a function
		objCS.StringCompareUsingEqualsfunction();
		
//		SplitStringWithDelimiter();
		
}
	//This function is defined in the same class as the main function
	private static void SplitStringWithDelimiter() {
		// Example input string with delimiter '|'
        String keywords = "login|signup|search|logout|profile";

        // Split the string into individual keywords
        String[] keywordArray = keywords.split("\\|");

        // Convert the array to a list for easier manipulation
        List<String> keywordList = Arrays.asList(keywordArray);

        // Perform actions based on each keyword
        for (String keyword : keywordList) {
        	System.out.println("Keyword is "+ keyword.toLowerCase());
            switch (keyword.toLowerCase()) {
                case "login":
                    performLoginTest();
                    break;
                case "signup":
                    performSignupTest();
                    break;
                case "search":
                    performSearchTest();
                    break;
                case "logout":
                    performLogoutTest();
                    break;
                case "profile":
                    performProfileTest();
                    break;
                default:
                    System.out.println("No action defined for keyword: " + keyword);
            }

	}
		
	}

	// Simulated test actions for each keyword
    private static void performLoginTest() {
        System.out.println("Executing login functionality test...");
        // Add login test logic here
    }

    private static void performSignupTest() {
        System.out.println("Executing signup functionality test...");
        // Add signup test logic here
    }

    private static void performSearchTest() {
        System.out.println("Executing search functionality test...");
        // Add search test logic here
    }

    private static void performLogoutTest() {
        System.out.println("Executing logout functionality test...");
        // Add logout test logic here
    }

    private static void performProfileTest() {
        System.out.println("Executing profile functionality test...");
        // Add profile test logic here
    }
}
