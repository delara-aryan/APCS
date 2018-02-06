import javax.swing.JOptionPane;

public class Ages {
	
	public static void main(String[] args) {
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
		if (age == 1) {
			System.out.println("infant");
		} else if (age == 2 || age == 3) {
			System.out.println("toddler");
		} else if (age == 4) {
			System.out.println("preschooler");
		} else if (age == 5) {
			System.out.println("kindergartener");
		} else if (age <= 10) {
			System.out.println("elementary age");
		} else if (age <= 13) {
			System.out.println("middle schooler");
		} else if (age <= 17) {
			System.out.println("high schooler");
		} else if (age == 18) {
			System.out.println("too cool");
		} else {
			System.out.println("old");
		}
	}

}
