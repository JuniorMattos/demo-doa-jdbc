/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Junior
 */
public class Program {
    
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println("---------- TEST 1: seller finById ----------");        
        Seller seller = sellerDao.findById(2);        
        System.out.println(seller);
        
        System.out.println("");
        
        System.out.println("---------- TEST 2: seller finByDepartment ----------"); 
        Department department = new Department(2, null);
        List <Seller> list = sellerDao.findByDepartment(department);
        
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("");
        
        System.out.println("---------- TEST 3: seller finByDepartment ----------"); 
        list = sellerDao.findAll();
        
        for(Seller obj : list){
            System.out.println(obj);
        }
    }
}
