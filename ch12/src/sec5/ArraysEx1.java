package sec5;

import java.util.Arrays;

public class ArraysEx1 {

    public static void main(String[] args) {

        char[] arr1 = {'m', 'o', 'n', 's', 't', 'a', 'X'};
        System.out.println("arr1 : " + arr1);
        char[] arr2 = arr1;                         // 얕은 복제
        // 얕은 복제 : 다른 곳(기억장소)에 같은 데이터를 복제하는 것이 아니라, 이미 저장되어 있는 데이터의 주소만을 다른 변수에 저장. 그러므로 실제 기억된 데이터는 1개만 존재함.
        System.out.println("arr2 : " + arr2);
        System.out.println("arr1 의 주소 : " + arr1.hashCode());
        System.out.println("arr2 의 주소 : " + arr2.hashCode());
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));

        // 예전에는 deepCopy 사용
        char[] arr3 = Arrays.copyOf(arr1, arr1.length);     // 모든 요소 복사 : 깊은 복제
        System.out.println("arr3 의 주소 : " + arr3.hashCode());
        System.out.println("arr1 == arr3 : " + (arr1 == arr3));                         // == : 배열은 주소로 비교하게 됨
        System.out.println("arr1 과 arr3 의 값 비교 : " + Arrays.equals(arr1, arr3));     // 배열의 값을 비교하려면 Arrays.equals 로 비교

        System.out.println("------------------------------------");

        System.out.print("정렬 전 : ");
        int[] points = {90, 100, 80, 70, 95, 85, 75};
        for(int p :points) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.print("정렬 후 : ");
        Arrays.sort(points);            // 오름차순 정렬 (default)
        for(int p :points) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.println("80 은 어디에? : " + Arrays.binarySearch(points, 80));

    }

}