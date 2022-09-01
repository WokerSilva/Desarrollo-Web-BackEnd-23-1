public class Category{

    private int category_id;
    private String category;

    public Category(){

    }

    /**
     * @param category_id
     * @param category
     */
    public Category(int category_id, String category){
        this.category_id = category_id;
        this.category = category;        
    }

    /**
     * @return
     */
    public int getCategory_id(){
        return category_id;
    }

    /**
     * @param category_id
     */
    public void setCategory_id(int category_id){
        this.category_id = category_id;
    }

    /**
     * @return
     */
    public String getCategory(){
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "ID " + category_id + " , " + "Categoria " + category;
    }
}