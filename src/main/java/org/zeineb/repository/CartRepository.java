package org.zeineb.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import org.zeineb.domain.Cart;


public class CartRepository {
    @Inject
    EntityManager em;

    public Cart findById(String id) {
        Cart c = em.find(Cart.class, id);
        if(c!=null){
         return c;
        }
        throw new EntityNotFoundException("cannot find person");
    }
    
    public Cart create() {
        return new Cart();
    }

    public void deleteCart(Integer id) {
        Cart c = em.find(Cart.class, id);
        if(c !=null){
            em.remove(c);
        }
    }

   
    
}
