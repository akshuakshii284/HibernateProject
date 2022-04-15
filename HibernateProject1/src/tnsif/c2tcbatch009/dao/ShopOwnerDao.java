package tnsif.c2tcbatch009.dao;

import tnsif.c2tcbatch009.entity.ShopOwner;

public interface ShopOwnerDao {
	void addShopOwner(ShopOwner shopOwner);

	void startTransaction();

	void endTransaction();
	
    void updateShopOwner(ShopOwner shopOwner);
    
    ShopOwner searchShopOwner(long id);
    
    void deleteShopOwner(long id);
}
