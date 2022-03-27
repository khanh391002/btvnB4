package com.example.cartproduct;

import com.example.cartproduct.domain.Cart;
import com.example.cartproduct.domain.CartProduct;
import com.example.cartproduct.service.CartProductService;
import com.example.cartproduct.service.CartService;
import com.example.cartproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CartproductApplication implements CommandLineRunner {
    @Autowired
    CartProductService cartProductService;
    @Autowired
    CartService cartService;
//    @Autowired
//    ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(CartproductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Cart cart = cartService.findCartByName("giohang1");
//        cartService.deleteCart("giohang1");
//        System.out.println(cart.toString());
//        List<Cart> carts = cartService.findAllByCartName(Arrays.asList("giohang1"));
//
//        carts.stream().forEach(product -> {
//            System.out.println(product.toString());
//            product.getCartProductList().stream().forEach(System.out::println);
//        });

        List<CartProduct> cartProductList = cartProductService.findAll();//kiểm tra tồn tại của cartName trong table cart và cart_product
//kiểm tra tồn tại của product_id trong table cart_product nếu cart_name của cart_product = cart_name của cart
        cartProductList.forEach(cartProduct -> {
            System.out.println(cartProduct.toString());//in ra thông tin của 3 table
//            CartProduct{id=1, cart=Cart{cartName='giohang1', cartId=1}, product=Product{id=1, name='Quan bo', price=1000}}
//            CartProduct{id=2, cart=Cart{cartName='giohang1', cartId=1}, product=Product{id=2, name='Ao khoac', price=2000}}
//            CartProduct{id=3, cart=Cart{cartName='giohang2', cartId=2}, product=Product{id=3, name='Ao so mi', price=1500}}
        });

        for (int i = 0; i< cartProductList.size(); i++){
            if (cartProductList.get(i).getProduct().getId() == 1){
                cartProductService.deleteCart(cartProductList.get(i));
                //select từ bảng product_cart mà có product_cart.cart_name = cart.cart_name và
                // product_cart.product_id = product.product_id
//với điều kiện product_cart.product_cart_id = giá trị truyền vào
                //kiểm tra tồn tại của product_cart.product_id trong bảng product_cart
                // left outer join product_cart.cart_name=cart.cart_name

                //kiểm tra tồn tại của product_cart.cart_name trong bảng product_cart
                // left outer join product_cart.product_id=product.product_id

                //kiểm tra tồn tại của product_cart.product_id trong bảng product_cart
                // left outer join product_cart.cart_name=cart.cart_name

                //truy vấn delete vs product_cart_id = giá trị truyền vào
            }
        }
//        for (int i = 0; i< cartProductList.size(); i++){
//            System.out.println(cartProductList.get(i).getCart().toString());
//        }
    }
}
