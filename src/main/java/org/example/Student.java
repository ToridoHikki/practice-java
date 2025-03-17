package org.example;

/*    Viết chương trình để tạo một lớp học sinh
 Giải thích đề bài

Bài tập yêu cầu bạn viết một chương trình để tạo một lớp HocSinh.
Lớp này sẽ chứa các thuộc tính và phương thức để mô tả và thao tác với đối tượng học sinh.
Các thuộc tính cơ bản của học sinh có thể bao gồm tên, tuổi, điểm trung bình,
và các phương thức để hiển thị thông tin học sinh hoặc tính toán các giá trị nào đó.
    chuong trinh xep loai theo diem trung binh:
    - diem trung binh >= 9.0: xuat sac
    - diem trung binh >= 8.0: gioi
    - diem trung binh >= 6.5: kha
    - diem trung binh >= 5.0: trung binh
    - diem trung binh < 5.0: yeu
*/
public class Student {

    String name;
    int age;
    double averageScore;


    void info () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Score: " + averageScore);
    }



    
}
