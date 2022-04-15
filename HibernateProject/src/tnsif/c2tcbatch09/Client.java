package tnsif.c2tcbatch09;

import tnsif.c2tcbatch09.dao.ShopDaoImpl;
import tnsif.c2tcbatch09.entity.Shop;
import tnsif.c2tcbatch09.entity.shopCategory;
import tnsif.c2tcbatch09.entity.shopStatus;
import tnsif.c2tcbatch09.service.ShopService;
import tnsif.c2tcbatch09.service.ShopServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop s=new Shop();
		ShopService ss=new ShopServiceImpl();
		s.setShopId(153002);
		s.setShopName("stationary1");
		s.setCustomers("ramu");
		s.setLeaseStatus("available");
		s.setShopOwner("ramesh ad");
		s.setShopEmployees("rajesh");
		s.setCustomers("rani");
		s.setShopCategory(shopCategory.WHOLESLE);
		s.setShopStatus(shopStatus.OPENED);
		ss.addShop(s);
		//System.out.print("shop is added successfully");
      // ss.updateShop(s);
        
        
		//System.out.print("shop is updated");
//System.out.print(ss.seachShopById((long) 11));
//ss.deleteShop((long) 14);//
	}

}
