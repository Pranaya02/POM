package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class ItemPage extends TestBase  {

	@FindBy (css = "ul li.preview")
	WebElement itemIcon;
	
	@FindBy(css = "div. detail-wrapper � button.call-to-action")
	WebElement addItemBtn;
	
	public ItemPage () {

		Pagefactory. initElements(driver, this);
		public void viewItemDetail() {

		itemIcon. click();
		}
	
		public void addItem() {

		addItemBtn.click();
}
