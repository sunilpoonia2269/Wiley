import java.util.Scanner;

class ItemType{
    private String name;
    private Double deposit;
    private Double costPerDay;
    
    public ItemType(String name, Double deposit, Double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Double getDeposit(){
        return deposit;
    }
    public void setDeposit(Double deposit){
        this.deposit = deposit;
    }
    
    public Double getCostPerDay(){
        return costPerDay;
    }
    
    public void setCostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }
    
    @Override
    public String toString(){
        return "Name:" + this.name + "\n" + "Deposit Amount:" + this.deposit + "\n" + "Cost Per Day:" + this.costPerDay;
    }
}

class ItemTypeBO{
    public void add(ItemType object, ItemType[] itemTypeArray, Integer index){
        if(itemTypeArray[index] != null){
            // Shift array element to right
            ItemType current = itemTypeArray[index];
            ItemType temp = itemTypeArray[index + 1];
            int startingIndex = index;
            while(itemTypeArray[startingIndex] != null){
                itemTypeArray[startingIndex + 1] = current;
                startingIndex++;
                current = itemTypeArray[startingIndex];
                temp = itemTypeArray[startingIndex + 1];
            }
            
            itemTypeArray[index] = object;
            
        }
    }
    
    public void search(String search, ItemType[] itemTypeArray){
        int flag = 0;
        for(int i=0; i<itemTypeArray.length; i++){
            if(itemTypeArray[i] == null) continue;
            
            if(itemTypeArray[i].getName().equals(search)){
                flag = 1;
                System.out.println("Searched Item Type is:");
                System.out.println(itemTypeArray[i]);
            }
        }
        if(flag == 1) return;
        System.out.println("Searched Item Type not found");
    }
    
    public void display(ItemType[] itemTypeArray){
        for(int i=0; i<itemTypeArray.length; i++){
            if(itemTypeArray[i] == null) continue;
            System.out.println("Item Type Number " + (i+1) + ":");
            System.out.println(itemTypeArray[i]);
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ItemType[] itemArray = new ItemType[10];
        ItemTypeBO itb = new ItemTypeBO();
        
        int number = sc.nextInt();
        
        for(int i=0; i<number; i++){
            String name = sc.nextLine();
            Double deposit = sc.nextDouble();
            Double costPerDay = sc.nextDouble();
            System.out.println(name);
            ItemType it = new ItemType(name, deposit, costPerDay);
            itb.add(it, itemArray, i);
        }
        
        
        itb.display(itemArray);
        
        String search = sc.nextLine();
        itb.search(search, itemArray);
        sc.close();
    }
}