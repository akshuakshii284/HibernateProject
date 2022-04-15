package tnsif.c2tcbatch009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tcbatch009.entity.ShopOwner;
import tnsif.c2tcbatch009.service.ShopOwnerImpl;
import tnsif.c2tcbatch009.service.ShopOwnerService;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
ShopOwner shopOwner=new ShopOwner();
ShopOwnerService ss=new ShopOwnerImpl();
shopOwner.setName("rajesh kumar");
shopOwner.setId(10006);
String datestring="26-05-1999";
SimpleDateFormat format=new SimpleDateFormat("dd-MM-yy");
Date d1=format.parse(datestring);
shopOwner.setDob(d1);
shopOwner.setShop(null);//
ss.addShopOwner(shopOwner);
//ss.updateShopOwner(shopOwner);
System.out.println(ss.searchShopOwner(10001));
//ss.deleteShopOwner(1004);
System.out.println("Student deleted sucessfullyy!");

	}

}
