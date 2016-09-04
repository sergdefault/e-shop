package tsymbaliuk.dao.impl;


import tsymbaliuk.dao.CategoryDAO;
import tsymbaliuk.model.Category;


import java.sql.SQLException;

import java.util.Collection;


/**
 * Created by Цымбалюк Сергей on 31.08.2016.
 */
public class CategoryDaoImpl implements CategoryDAO {

    @Override
    public void addCategory(Category category) throws SQLException {

    }

    @Override
    public void updateCategory(int category_id, Category category) throws SQLException {

    }

    @Override
    public Category getCategoryById(int category_id) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllCategories() throws SQLException {
        return null;
    }

    @Override
    public void deleteCategory(Category category) throws SQLException {

    }
}


