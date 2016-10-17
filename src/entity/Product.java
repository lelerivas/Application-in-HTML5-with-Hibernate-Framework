package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbproduct")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer cod;	

private String name;

@Column(name = "maker")
private String maker;

@Temporal(TemporalType.DATE)
@Column(name = "manufdate")
private Date manufdate;

private Integer qtd;

private Double price;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(Integer cod, String name, String maker, Date manufdate, Integer qtd, Double price) {
	super();
	this.cod = cod;
	this.name = name;
	this.maker = maker;
	this.manufdate = manufdate;
	this.qtd = qtd;
	this.price = price;
}

@Override
public String toString() {
	return "Product [cod=" + cod + ", name=" + name + ", maker=" + maker + ", manufdate=" + manufdate + ", qtd=" + qtd
			+ ", price=" + price + "]";
}

public Integer getCod() {
	return cod;
}

public void setCod(Integer cod) {
	this.cod = cod;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMaker() {
	return maker;
}

public void setMaker(String maker) {
	this.maker = maker;
}

public Date getManufdate() {
	return manufdate;
}

public void setManufdate(Date manufdate) {
	this.manufdate = manufdate;
}

public Integer getQtd() {
	return qtd;
}

public void setQtd(Integer qtd) {
	this.qtd = qtd;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}
	
}
