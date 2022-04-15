package tnsif.c2tcbatch09.service;

import tnsif.c2tcbatch09.entity.Shop;

public interface ShopService {

public	Shop addShop(Shop s);

public	Shop updateShop(Shop s);

public 	 Shop seachShopById(Long id);
public	 boolean deleteShop(long id);

}
