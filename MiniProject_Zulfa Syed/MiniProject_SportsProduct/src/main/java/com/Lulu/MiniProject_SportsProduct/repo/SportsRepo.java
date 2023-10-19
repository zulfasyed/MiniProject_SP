package com.Lulu.MiniProject_SportsProduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lulu.MiniProject_SportsProduct.entity.SportsProduct;



public interface SportsRepo extends JpaRepository<SportsProduct, Integer> {

}