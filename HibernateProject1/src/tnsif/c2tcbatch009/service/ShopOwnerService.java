package tnsif.c2tcbatch009.service;

import tnsif.c2tcbatch009.entity.ShopOwner;

public interface ShopOwnerService {

	void addShopOwner(ShopOwner shopOwner);
	void updateShopOwner(ShopOwner shopOwner);
	ShopOwner searchShopOwner(long id);
	void deleteShopOwner(long id);

}
