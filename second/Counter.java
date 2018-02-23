
public class Counter extends Thread{

	private boolean itemSelected;
	private int count;

	public Counter(boolean itemSelected) {
		this.itemSelected = itemSelected;
		
	}
	
	public void run() {
		
		while(itemSelected) {
			try {
				Thread.sleep(1);
				count++;
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	
	
	public void setItemSelected(boolean itemSelected) {
		
		this.itemSelected = itemSelected;
	}
	
	public int getCount() {
		return count;
	}
}