package tsymbaliuk.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tsymbaliuk.dao.daoImpl.CategoryDaoImpl;
import tsymbaliuk.model.Category;
import tsymbaliuk.model.Product;
import tsymbaliuk.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Цымбалюк Сергей on 02.09.2016.
 */
public class Test {
    public static void main(String[] args) {

            Category category = new CategoryDaoImpl().getCategoryById(1);
            System.out.println(category);


    }

}
