import com.ANIMAL;

public class Food extends ANIMAL {



    private String FavoriteFood;
    private int Price;
    private int quantity;
    private int Availabilitystok;




    public int getPrice() {

        return Price;
    }

    public void setPrice(int price) {
        this.Price = Price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public String getFavoriteFood() {

        return FavoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.FavoriteFood = FavoriteFood;
    }

    public int getAvailabilitystok() {

        return Availabilitystok;
    }

    public void setAvailabilitystok(int availabilitystok) {

        Availabilitystok = availabilitystok;
    }


    }




