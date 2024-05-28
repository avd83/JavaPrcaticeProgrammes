package InstanceStaticConstructorBlocks;

public class BlocksPrintComparison {

	BlocksPrintComparison() {
		System.out.println("this is constructor block");
	}

	{
		System.out.println("this is instance block");
	}

	static {

		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		System.out.println("this is main block :1");
		BlocksPrintComparison bpc = new BlocksPrintComparison();
		System.out.println("this is main block:2");
	}

}
