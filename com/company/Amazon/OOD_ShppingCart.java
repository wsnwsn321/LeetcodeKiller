package com.company.Amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OOD_ShppingCart {
    public class Customer{
        private String name;
        private String id;
        private Map<Product,Integer> cart;
        Customer(String name, String id){
            cart= new HashMap<>();
            this.name = name;
            this.id = id;
        }

        public void addToCart(Product p){
            cart.put(p,cart.getOrDefault(p,0)+1);
        }
        public void addToCart(Product p,int amount){
            cart.put(p,cart.getOrDefault(p,0)+amount);
        }

        public void removeFromCart(Product p){
            if (!cart.containsKey(p)) return;
            cart.put(p,cart.get(p)-1);
        }
        public void removeFromCart(Product p, int amount){
            if (!cart.containsKey(p)) return;
            cart.put(p,cart.get(p)-amount);
        }

        public double checkOut(){
            double res= 0;
            for (Product p:cart.keySet()){
                res+=p.price*cart.get(p);
            }
            return res;
        }

    }

    public class Product{
        String product_name;
        double price;
        Product(String name, double price){
            this.product_name = name;
            this.price = price;
        }
    }
}
