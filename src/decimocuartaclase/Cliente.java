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
public class Cliente extends Usuario{
    private String customerName;
    private String address;
    private String email;
    private String credicCardInfo;
    private String shippingInfo;
    private float accountBalance;
    
    private final Pedido[] pedido;
    
        public Cliente(String customerName, String address, String email, String credicCardInfo, String shippingInfo, float accountBalance) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.credicCardInfo = credicCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
        
        pedido = new Pedido[100];
        
       
    }
    public void register(){
    }
    public void login(){
    }
    public void updateProfile(){
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCredicCardInfo() {
        return credicCardInfo;
    }

    public void setCredicCardInfo(String credicCardInfo) {
        this.credicCardInfo = credicCardInfo;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

        
    
}
