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
    private String credictCardInfo;
    private String shippingInfo;
    private float accountBalance;

    public Cliente(String customerName, String address, String email, String credictCardInfo, String shippingInfo, float accountBalance) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.credictCardInfo = credictCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
    }
    public void register(){
    }
    
    
    
    
}
