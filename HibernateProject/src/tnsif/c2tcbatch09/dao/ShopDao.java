package tnsif.c2tcbatch09.dao;

import tnsif.c2tcbatch09.entity.Shop;

public interface ShopDao {

	void startTransaction();

    Shop addShop(Shop s);

	void endTransaction();

	Shop updateShop(Shop s);

	Shop seachShopById(Long Id);

	boolean deleteShop(long id);
	
	//void addItem(Item item);//

	
}
