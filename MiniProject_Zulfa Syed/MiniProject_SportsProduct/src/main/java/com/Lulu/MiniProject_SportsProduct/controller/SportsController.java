package com.Lulu.MiniProject_SportsProduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lulu.MiniProject_SportsProduct.entity.SportsProduct;
import com.Lulu.MiniProject_SportsProduct.repo.SportsRepo;

import jakarta.persistence.EntityNotFoundException;


@RestController
@RequestMapping("/SP")
public class SportsController {
	@Autowired

	SportsRepo sportsrepo;

	@GetMapping("/getsport")

	public List<SportsProduct> getPurchase() {

	return sportsrepo.findAll();

	}

	@PostMapping("/addsport")

	public SportsProduct createPurchase(@RequestBody SportsProduct sp) {

	return sportsrepo.save(sp);

	}

	@DeleteMapping("/delsport/{id}")

	public void deletePurchase(@PathVariable int id) {

		sportsrepo.deleteById(id);

	}
	
	@PutMapping("/updatesport/{id}")
	public SportsProduct updatePurchase(@PathVariable int id, @RequestBody SportsProduct updatedProduct) {
	    Optional<SportsProduct> existingProduct = sportsrepo.findById(id);

	    if (existingProduct.isPresent()) {
	        SportsProduct productToUpdate = existingProduct.get();
	        
	        // Update the fields of the existing product with the new data
	        if (updatedProduct.getName() != null) {
	            productToUpdate.setName(updatedProduct.getName());
	        }
	        if (updatedProduct.getDescp() != null) {
	            productToUpdate.setDescp(updatedProduct.getDescp());
	        }
	        if (updatedProduct.getCost() != 0.0) {
	            productToUpdate.setCost(updatedProduct.getCost());
	        }

	        // Save the updated product to the repository
	        return sportsrepo.save(productToUpdate);
	    } else {
	        // Handle the case where the product with the given ID doesn't exist
	        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");
	    }
	}

}
