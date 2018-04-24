/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.dao.custom;

import lk.ijse.asirisupermarket.core.dto.ProductDTO;
import lk.ijse.asirisupermarket.dao.SuperDAO;

/**
 *
 * @author Hafees
 */
public interface ProductDAO extends SuperDAO<ProductDTO>{
    public boolean updateProduct(ProductDTO dto) throws Exception;
}
