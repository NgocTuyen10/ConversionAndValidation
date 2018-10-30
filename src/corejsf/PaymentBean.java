package corejsf;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "payment")
@SessionScoped
public class PaymentBean {

	private double amount;
	private String card = "";
	private Date date = new Date();

	public void setAmount(double newValue) {
		amount = newValue;
	}

	public double getAmount() {
		return amount;
	}

	public void setCard(String newValue) {
		card = newValue;
	}

	public String getCard() {
		return card;
	}

	public void setDate(Date newValue) {
		date = newValue;
	}

	public Date getDate() {
		return date;
	}
}
