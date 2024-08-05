import java.util.*;
public class PhoneBook {
    public TreeMap<String, String> phoneBook;
    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println(phoneBook);
    }
    public void removeContact(String name) {
        phoneBook.remove(name);
    }
    public String searchContact(String name) {
        return phoneBook.get(name);
    }
    public void display(){
        for(Map.Entry<String,String> e:phoneBook.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        phone.addContact("man", "9999999999");
        phone.addContact("women", "88888888");
        phone.searchContact("man");
        phone.display();
    }
}
