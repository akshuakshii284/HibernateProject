package tnsif.c2tcbatch09.dao;

import javax.persistence.EntityManager;

import tnsif.c2tcbatch09.entity.Shop;

public class ShopDaoImpl implements ShopDao {
	EntityManager entityManager;
	public ShopDaoImpl() {
		entityManager=Configuration.getEntityManager();
	}
	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}
	
	@Override
	public void endTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}
	
	
	@Override
	public Shop seachShopById(Long Id) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.find(Shop.class, Id);
		return shop;
	}
	@Override
	public boolean deleteShop(long id) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.find(Shop.class, id);
		entityManager.remove(shop);
		return false;
		
	}
	
	@Override
	public Shop updateShop(Shop s) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.merge(s);
		return shop;
	}
	@Override
	public Shop addShop(Shop s) {
		// TODO Auto-generated method stub
		entityManager.persist(s);
		return s;
		
	}
	
	
	}
	
	

