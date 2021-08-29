package repositories;

import model.Category;

import java.util.List;

public interface CategoryRepository {
    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public List<Category> listAllCategories();

    public void deleteCategory(long category_id);
}