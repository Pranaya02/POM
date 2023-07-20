package testScripts;

import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.ItemPage;
public class PlaceOrderTest extends TestBase { 
  HomePage homepage;
	@Test
  public void launchapp() {
	  initialize ();
  }
  
  @Test
  public void searchItemTest () {
     homepage = new HomePage() ;
     homepage. searchItem("Parry Hotter");
     itemPage = new ItemPage();
     itemPage.viewItemDetail();
     itemPage.addItem();
}
  
  public void checkoutTest () {
  }
  }
