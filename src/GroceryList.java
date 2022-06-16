import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void AddItem(String item){
        groceryList.add(item);

    }

    public void PrintGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ", " + groceryList.get(i));
        }
    }

    public void ModifyItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void RemoveItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String FindItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
