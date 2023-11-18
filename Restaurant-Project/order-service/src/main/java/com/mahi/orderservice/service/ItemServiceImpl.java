package com.mahi.orderservice.service;


import com.mahi.orderservice.feignClient.ProductClient;
import com.mahi.orderservice.entity.Item;
import com.mahi.orderservice.repository.ItemRepository;
import com.mahi.orderservice.response.Product;
import com.mahi.orderservice.response.ResponseDataOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ProductClient productClient;
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public ResponseDataOrder getItemUser(Long itemId) {
     ResponseDataOrder responseDataOrder=new ResponseDataOrder();
     Item item=itemRepository.findItemByitemId(itemId);
     Product product=productClient.findProductById(item.getProductId());
     responseDataOrder.setItem(item);
     responseDataOrder.setProduct(product);
     return responseDataOrder;
    }
}




   /* @Autowired
    private CartRedisRepository cartRedisRepository;


    public void addItemToCart(String cartId, Long productId, Long quantity) {
        Product product = productClient.getProductById(productId);
        Item item = new Item(quantity,product, CartUtilities.getSubTotalForItem(product));
        cartRedisRepository.addItemToCart(cartId, item);
    }

    public List<Object> getCart(String cartId) {

        return (List<Object>)cartRedisRepository.getCart(cartId, Item.class);
    }

    public void changeItemQuantity(String cartId, Long productId, Integer quantity) {
        List<Item> cart = (List)cartRedisRepository.getCart(cartId, Item.class);
        for(Item item : cart){
            if((item.getProduct().getId()).equals(productId)){
                cartRedisRepository.deleteItemFromCart(cartId, item);
                item.setQuantity(quantity);
                item.setSubTotal(CartUtilities.getSubTotalForItem(item.getProduct(),quantity));
                cartRedisRepository.addItemToCart(cartId, item);
            }
        }
    }

    public void deleteItemFromCart(String cartId, Long productId) {
        List<Item> cart = (List) cartRedisRepository.getCart(cartId, Item.class);
        for(Item item : cart){
            if((item.getProduct().getId()).equals(productId)){
                cartRedisRepository.deleteItemFromCart(cartId, item);
            }
        }
    }

    public boolean checkIfItemIsExist(String cartId, Long productId) {
        List<Item> cart = (List) cartRedisRepository.getCart(cartId, Item.class);
        for(Item item : cart){
            if((item.getProduct().getId()).equals(productId)){
                return true;
            }
        }
        return false;
    }

    public List<Item> getAllItemsFromCart(String cartId) {
        List<Item> items = (List)cartRedisRepository.getCart(cartId, Item.class);
        return items;
    }

    public void deleteCart(String cartId) {
        cartRedisRepository.deleteCart(cartId);
    }
}*/
