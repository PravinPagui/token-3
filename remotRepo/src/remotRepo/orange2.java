package remotRepo;

	public class orange2 {
		String color;
		orange2(String color)
		{
		this.color=color;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		orange2 greenApple = new orange2("green");
		String color = greenApple.getcolor();
		System.out.println("color of apple is " + color);

	}
		private String getcolor() {
			// TODO Auto-generated method stub
			return color;
		}

}
