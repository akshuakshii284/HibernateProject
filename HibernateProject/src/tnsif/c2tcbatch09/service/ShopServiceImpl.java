package tnsif.c2tcbatch09.service;

import tnsif.c2tcbatch09.dao.ShopDao;
import tnsif.c2tcbatch09.dao.ShopDaoImpl;
import tnsif.c2tcbatch09.entity.Shop;

public class ShopServiceImpl implements ShopService{
ShopDao sd;

	public ShopServiceImpl() {
	sd=new ShopDaoImpl();
}

	@Override
	public Shop addShop(Shop s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addShop(s);
		sd.endTransaction();
		return s;
		
	}

	@Override
	public Shop updateShop(Shop s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
	Shop shop=sd.updateShop(s);
		sd.endTransaction();
		return shop;
	}

	@Override
	public Shop seachShopById(Long id) {
		// TODO Auto-generated method stub
		Shop shop=sd.seachShopById(id);
		return shop;
	}

	@Override
	public boolean deleteShop(long id) {
		// TODO Auto-generated method stub
		sd.startTransaction();
        sd.deleteShop(id);
		sd.endTransaction();
		return false;
	}

	
		
	
	}

	


