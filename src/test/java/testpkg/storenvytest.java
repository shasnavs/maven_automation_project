package testpkg;

import org.testng.annotations.Test;

import basepkg.Storenvybase;
import pagepkg.StorenvyPage;
import utilitiespkg.Storenvyutilities;

public class storenvytest extends Storenvybase{
	
	@Test
	public void testing()
	{
		StorenvyPage s1=new StorenvyPage(driver);
		String xl="‪‪C:\\Users\\HP\\Documents\\STORENVYY.xlsx";
		String Sheet="Sheet1";
		int rowCount = Storenvyutilities.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{	

			String email=Storenvyutilities.getCellValue(xl, Sheet, i, 0);
			String pass=Storenvyutilities.getCellValue(xl, Sheet, i, 1);
			//s1.signin();
			s1.setvalues(email, pass);
			s1.login();
			s1.jwellerymenu();
			s1.mens();
			s1.sortby();
			s1.sortbynewest();
			s1.firstproduct();
			s1.addtowish();
			s1.searchvalues("toys");
			s1.searchbttn();
			s1.product();
			s1.addtocart();
		}
	}

}
