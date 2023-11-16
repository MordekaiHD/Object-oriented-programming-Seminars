import java.util.*;
public class FilterNotebooks {
    public static void main(String[] args) {
        Set<Notebook> laptops = new HashSet<>();
        laptops.add(new Notebook("Dell", 8, 500, "Windows", "Black"));
        laptops.add(new Notebook("HP", 16, 1000, "Windows", "Silver"));
        laptops.add(new Notebook("Apple", 8, 512, "macOS", "Silver"));
        laptops.add(new Notebook("Acer", 16, 512, "Windows", "Black"));
        laptops.add(new Notebook("Lenovo", 8, 256, "Windows", "Black"));

        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "RAM");
        filterCriteria.put(2, "Storage");
        filterCriteria.put(3, "OS");
        filterCriteria.put(4, "Color");

        Map<String, Object> filterValues = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : filterCriteria.entrySet()) {
            System.out.print("Enter the minimum value for " + entry.getValue() + ": ");
            Object value = scanner.nextLine();
            filterValues.put(entry.getValue(), value);
        }

        Set<Notebook> filteredLaptops = filterLaptops(laptops, filterValues);

        for (Notebook laptop : filteredLaptops) {
            System.out.println();
            System.out.println("Brand: " + laptop.getBrand());
            System.out.println("RAM: " + laptop.getRam());
            System.out.println("Storage: " + laptop.getStorage());
            System.out.println("OS: " + laptop.getOs());
            System.out.println("Color: " + laptop.getColor());
            System.out.println();
        }
    }
    public static Set<Notebook> filterLaptops(Set<Notebook> laptops, Map<String, Object> filterValues) {
        Set<Notebook> filteredLaptops = new HashSet<>();

        for (Notebook laptop : laptops) {
            boolean passedFilter = true;

            for (Map.Entry<String, Object> entry : filterValues.entrySet()) {
                String criteria = entry.getKey();
                Object value = entry.getValue();

                if (criteria.equals("ram") && laptop.getRam() < Integer.parseInt(value.toString())) {
                    passedFilter = false;
                    break;
                }

                if (criteria.equals("storage") && laptop.getStorage() < Integer.parseInt(value.toString())) {
                    passedFilter = false;
                    break;
                }

                if (criteria.equals("os") && !laptop.getOs().equals(value)) {
                    passedFilter = false;
                    break;
                }

                if (criteria.equals("color") && !laptop.getColor().equals(value)) {
                    passedFilter = false;
                    break;
                }
            }

            if (passedFilter) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }
}
