/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimocuartaclase;

/**
 *
 * @author Meryan
 */
public class Pedido {
    private int oderId;
    private String dateCreated;
    private String dateShipped;
    private String customerName;
    private String customerId;
    private String status;
    private String shippingId;

    public Pedido(int oderId, String dateCreated, String dateShipped, String customerName, String customerId, String status, String shippingId) {
        this.oderId = oderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerId = customerId;
        this.status = status;
        this.shippingId = shippingId;
    }
    
    public void placeOrder(){
    
    }

    public int getOderId() {
        return oderId;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }
    
}
