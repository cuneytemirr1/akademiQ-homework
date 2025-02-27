import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Soru 1: 10 tam sayı al, ortalamayı hesapla ve 50'den büyükleri listele
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        System.out.println("10 adet sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / 10;
        System.out.println("Ortalama: " + average);
        System.out.print("50'den büyük sayılar: ");
        for (int num : numbers) {
            if (num > 50) System.out.print(num + " ");
        }
        System.out.println();

        // Soru 2: Tekrar eden elemanları bulma
        int[] arr = {5, 3, 8, 3, 1, 5, 8};
        Set<Integer> seen = new HashSet<>(), duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        System.out.println("Tekrar eden sayılar: " + duplicates);

        // Soru 3: Pozitif ve negatif sayıların toplamı
        int posSum = 0, negSum = 0;
        int[] numArr = {10, -5, 7, -2, -8, 4};
        for (int num : numArr) {
            if (num > 0) posSum += num;
            else negSum += num;
        }
        System.out.println("Pozitif toplam: " + posSum);
        System.out.println("Negatif toplam: " + negSum);

        // Soru 4: Girilen 10 sayıyı büyükten küçüğe sıralama
        ArrayList<Integer> numList = new ArrayList<>();
        System.out.println("10 sayı giriniz:");
        for (int i = 0; i < 10; i++) numList.add(scanner.nextInt());
        numList.sort(Collections.reverseOrder());
        System.out.println("Sıralı liste: " + numList);

        // Soru 5: 10 kelimeyi alfabetik sıraya göre sıralama
        ArrayList<String> words = new ArrayList<>();
        System.out.println("10 kelime giriniz:");
        for (int i = 0; i < 10; i++) words.add(scanner.next());
        Collections.sort(words);
        System.out.println("Alfabetik sıralı: " + words);

        // Soru 6: Rastgele 20 sayı ve çiftleri listeleme
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(100);
            randomNumbers.add(num);
            if (num % 2 == 0) evenNumbers.add(num);
        }
        System.out.println("Çift sayılar: " + evenNumbers);

        // Soru 7: Şehir listesinde arama
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul", "Ankara", "İzmir", "Bursa", "Antalya"));
        System.out.println("Bir şehir adı giriniz:");
        String city = scanner.next();
        if (cities.contains(city)) System.out.println(city + " bulundu, indeksi: " + cities.indexOf(city));
        else System.out.println(city + " listede yok.");

        // Soru 8: En büyük ve en küçük elemanı bulma
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(12, 45, 2, 67, 33, 89, 5, 76, 100, 23));
        System.out.println("En büyük: " + Collections.max(numberList));
        System.out.println("En küçük: " + Collections.min(numberList));

        // Soru 9: ArrayList metodları
        ArrayList<String> exampleList = new ArrayList<>(Arrays.asList("Elma", "Armut", "Muz"));
        System.out.println("get(1): " + exampleList.get(1));
        exampleList.set(1, "Çilek");
        System.out.println("set(1, Çilek): " + exampleList);
        exampleList.remove("Muz");
        System.out.println("remove(Muz): " + exampleList);
        exampleList.clear();
        System.out.println("clear(): " + exampleList);
        System.out.println("size(): " + exampleList.size());

        // Soru 10: Arrays metodları
        int[] arrExample = {3, 1, 4, 1, 5, 9};
        Arrays.sort(arrExample);
        System.out.println("Sorted: " + Arrays.toString(arrExample));
        System.out.println("Binary search (4): " + Arrays.binarySearch(arrExample, 4));
        int[] copied = Arrays.copyOfRange(arrExample, 1, 4);
        System.out.println("Copy range (1-4): " + Arrays.toString(copied));
        int[] arr1 = {1, 2, 3}, arr2 = {1, 2, 3};
        System.out.println("Equals: " + Arrays.equals(arr1, arr2));
        Arrays.fill(arr1, 9);
        System.out.println("Filled with 9: " + Arrays.toString(arr1));
    }
}
