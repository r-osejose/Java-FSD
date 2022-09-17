package Interface;

interface read{
	void show();
	interface write{
		void msg();
	}
}
public class Message implements read.write{
		public void msg() {
			System.out.println("Hello!! Nested Interface");
		}
public static void main(String[] args) {
	read.write message = new Message();
	message.msg();
}
}
