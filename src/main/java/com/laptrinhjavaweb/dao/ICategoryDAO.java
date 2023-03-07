package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;

public interface ICategoryDAO {
	//lay all ds the loai
	List<CategoryModel> findAll();
}
