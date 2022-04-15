package tnsif.c2tcbatch009.service;

import tnsif.c2tcbatch009.dao.ShopOwnerDao;
import tnsif.c2tcbatch009.dao.ShopOwnerDaoImpl;
import tnsif.c2tcbatch009.entity.ShopOwner;

public class ShopOwnerImpl implements ShopOwnerService {
ShopOwnerDao sod;
public ShopOwnerImpl()
{
	sod=new ShopOwnerDaoImpl();
	
}
@Override
public void addShopOwner(ShopOwner shopOwner) {
	// TODO Auto-generated method stub
	sod.startTransaction();
	sod.addShopOwner(shopOwner);
	sod.endTransaction();
}
@Override
public void updateShopOwner(ShopOwner shopOwner) {
	// TODO Auto-generated method stub
	sod.startTransaction();
	sod.updateShopOwner(shopOwner);
	sod.endTransaction();
	
}
@Override
public ShopOwner searchShopOwner(long id) {
	// TODO Auto-generated method stub
	ShopOwner so=sod.searchShopOwner(id);
	return so;
}
@Override
public void deleteShopOwner(long id) {
	// TODO Auto-generated method stub
	sod.startTransaction();
	sod.deleteShopOwner(id);
	sod.endTransaction();
	
}
}
