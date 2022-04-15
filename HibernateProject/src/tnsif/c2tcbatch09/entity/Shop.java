package tnsif.c2tcbatch09.entity;

import java.rmi.dgc.Lease;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Shop {
	@Id
	private long shopId;
	private shopCategory shopCategory;
	private String shopEmployees;
	private String shopName;
	private String customers;
	private shopStatus shopStatus;
	private String shopOwner;
	private String leaseStatus;
	private boolean isdeleteShop=true;
	
	public boolean isIsdeleteShop() {
		return isdeleteShop;
	}
	public void setIsdeleteShop(boolean isdeleteShop) {
		this.isdeleteShop = isdeleteShop;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public shopCategory getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(shopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopEmployees() {
		return shopEmployees;
	}
	public void setShopEmployees(String shopEmployees) {
		this.shopEmployees = shopEmployees;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public shopStatus getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(shopStatus shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployees=" + shopEmployees
				+ ", shopName=" + shopName + ", customers=" + customers + ", shopStatus=" + shopStatus + ", shopOwner="
				+ shopOwner + ", leaseStatus=" + leaseStatus + "]";
	}


}
