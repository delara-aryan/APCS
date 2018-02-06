import java.util.Arrays;

import javax.swing.JOptionPane;

public class ThreeNumbers {
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer."));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer."));
		int[] nums = {x, y, z};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
