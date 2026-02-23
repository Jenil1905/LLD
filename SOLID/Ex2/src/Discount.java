public class Discount {
    public double caclDiscount(String customerType , double subtotal , int size){
       double discount = DiscountRules.discountAmount(customerType, subtotal, size);
        return discount;
    }
}
