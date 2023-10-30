# **IV.OOP(1)**

## 1. Lớp và đối tượng

## 2. Phương thức

## 3. Java Method Overloading (Nạp chồng phương thức)

   - Hai hoặc nhiều phương thức có thể có cùng tên trong cùng một lớp nếu chúng chấp nhận các đối số khác nhau.
     Tính năng này được gọi là nạp chồng phương thức.
   - Các cách nạp chồng phương thức:
      + Nạp chồng bằng thay đổi số lượng tham số
      + Nạp chồng bằng thay đổi kiểu dữ liệu của tham số
   - Không phải là nạp chồng phương thức nếu chỉ thay đổi kiểu trả về của phương thức. Phải có sự khác biệt về số lượng
     tham số.

## 4. Java Constructors (Hàm tạo)

   - Hàm tạo trong Java tương tự như một phương thức được gọi khi một đối tượng của lớp được tạo. Một hàm tạo có cùng
     tên với
     tên của lớp và không có bất kỳ kiểu trả về nào
   - Trong Java có 3 loại hàm tạo:
      + No-Arg Constructor : hàm tạo không chấp nhận bất kỳ đối số nào
      + Parameterized Constructor : hàm tạo chấp nhận các đối số
      + Default Constructor : hàm tạo được trình biên dịch Java tự động tạo nếu nó không được xác định rõ ràng.
   - No-Arg Constructor
      + Nếu một hàm tạo không chấp nhận bất kỳ tham số nào thì nó được gọi là hàm tạo không có đối số
   - Default Constructor
   - Trọng tâm:
      + Hàm tạo được gọi ngầm khi bạn khởi tạo đối tượng.
      + Hai quy tắc để tạo hàm tạo là: Tên của hàm tạo phải giống với tên lớp. Hàm tạo Java không được có kiểu trả về.
      + Nếu một lớp không có hàm tạo, trình biên dịch Java sẽ tự động tạo một hàm tạo mặc định trong thời gian chạy.
        Hàm tạo mặc định khởi tạo các biến thể hiện với các giá trị mặc định. Ví dụ biến int sẽ được khởi tạo là 0
      + Hàm tạo không thể abstract (trừu tượng), static (tĩnh) hoặc final (cuối cùng).
      + Một hàm tạo có thể bị nạp chồng nhưng không thể bị ghi đè.

## 5. Java Strings

   - Các chuỗi trong Java không phải là kiểu nguyên thủy (như int, char, v.v.). Thay vào đó, tất cả các chuỗi đều là
     đối tượng của một lớp được xác định trước có tên là String. Và tất cả các biến chuỗi đều là các thể hiện của lớp
     String.
   - Phương thức:
      + length() lấy độ dài của chuỗi
      + concat() nối chuỗi
      + equals() so sánh chuỗi

## 6. Java Access Modifiers (Phạm vi truy cập)

   - Được sử dụng để thiết lập khả năng truy cập (mức độ hiển thị) của các lớp, giao diện, biến, phương thức, hàm tạo,
     thành viên dữ liệu và phương thức setter
   - Chú ý: không thể đặt phạm vi truy cập của phương thức getters
   - Loại truy cập:
      + Default: phạm vi package
      + Private: trong phạm vi lớp khai báo
      + Protected : phạm vi truy cập là lớp hiện tại và lớp con kế thừa lớp đó
      + Public: truy cập được từ bất cứ đâu
   - Private:
      + Để truy cập vào biến có phạm vi truy cập là private thì sử dụng phương thức getter và setter

## 7. Java this Keyword (Từ khóa this)

   - Từ khóa this được dùng để chỉ đối tượng hiện tại bên trong một phương thức hoặc hàm tạo.
   - this không là gì ngoài tham chiếu đến đối tượng hiện tại.
   - this với Contructor
   - this với setter và getter
   - this với nạp chồng hàm tạo: Trong khi làm việc với nạp chồng hàm tạo, chúng ta có thể phải gọi một hàm tạo này
     từ một hàm tạo khác. Trong trường hợp như vậy, chúng ta không thể gọi hàm tạo một cách rõ ràng. Thay vào đó, chúng
     ta phải sử dụng từ khóa this. Ở đây, chúng tôi sử dụng một dạng khác của từ khóa this. Tức là this()
   - tham biến:
   - tham số:
   - đối số:
   - tham chiếu:
   - tham trị:

## 8. Java final keyword (Từ khóa final)

   - Từ khóa final được sử dụng để biểu thị các hằng số. Nó có thể được sử dụng với các biến, phương thức và lớp.
   - Khi bất kỳ thực thể nào (biến, phương thức hoặc lớp) được khai báo final, nó chỉ có thể được gán một lần.
      + Biến final không thể được khởi tạo lại bằng giá trị khác
      + Phương thức final không thể ghi đè
      + Class final không thể được kế thừa
   - Chú ý: Nên sử dụng chữ hoa để khai báo các biến cuối cùng trong Java.

## 9. Java Recursion (Đệ quy)

   - Một phương thức gọi chính nó được gọi là phương thức đệ quy. Và quá trình này được gọi là đệ quy.
   - Để dừng cuộc gọi đệ quy, chúng ta cần cung cấp một số điều kiện bên trong phương thức. Nếu không, phương thức sẽ
     được gọi vô hạn.

## 10. Java instanceof Operator

   - Toán tử instanceof trong Java được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện của một lớp cụ
     thể hay không.
   - Cú pháp: objectName instanceOf className;
   - Có thể sử dụng toán tử instanceof để kiểm tra xem các đối tượng của lớp con có phải là một thể hiện của
     lớp cha hay không
   - Sử dụng để kiểm tra xem một đối tượng của một lớp có phải là một thể hiện của giao diện được lớp đó triển khai
     hay không.

# V. OOP(2)

## 1. Java Inheritance (Kế thừa)

   - Kế thừa là một trong những tính năng chính của OOP cho phép chúng ta tạo một lớp mới từ một lớp hiện có.
   - Lớp mới được tạo được gọi là lớp con (lớp con hoặc lớp dẫn xuất) và lớp hiện có mà lớp con được dẫn xuất được gọi
     là lớp cha (lớp cha hoặc lớp cơ sở).
   - Sự kế thừa là một mối quan hệ. Chúng ta chỉ sử dụng kế thừa nếu tồn tại một mối quan hệ giữa hai class
   - Phương thức ghi đè trong kế thừa
   - Sử dụng chú thích @Override để báo cho trình biên dịch biết rằng chúng tôi đang ghi đè một phương thức. Tuy nhiên,
     chú thích là không bắt buộc
   - super: Từ khóa super được sử dụng để gọi phương thức của lớp cha từ phương thức của lớp con.
   - Phạm vi truy cập protected trong kế thừa: một class có phương thức và class protected thì những lớp và trường đó
     được truy cập từ lớp con của lớp đó.
   - Ghi đè phương thức còn được gọi là đa hình thời gian chạy. Do đó, chúng ta có thể đạt được Tính đa hình trong Java
     với sự trợ giúp của tính kế thừa.
   - Có 5 loại kế thừa:
      + Kế thừa đơn: một lớp con duy nhất mở rộng từ một siêu lớp duy nhất
      + Kế thừa đa cấp: class C kế thừa class B kế thừa class A
      + Kế thừa phân cấp: nhiều lớp kế thừa từ một lớp cha
      + Đa kế thừa: một lớp con kế thừa từ nhiều lớp cha. Java không hỗ trợ đa kế thừa. Tuy nhiên, có thể đạt được đa
        kế thừa bằng cách sử dụng
      + Kế thừa kết hợp: là sự kết hợp của hai hay nhiều kiểu thừa kế. Kết hợp kế thừa phân cấp và đa kế thừa để tạo
        thành kế thừa kết hợp.

## 2. Java Method Overriding

   - Quy tắc ghi đè:
      + Cả lớp cha và lớp con phải có cùng tên phương thức, cùng kiểu trả về và cùng danh sách tham số.
      + Không thể ghi đè phương thức được khai báo là final và static.
      + Phải luôn ghi đè các phương thức trừu tượng của siêu lớp.
      + Điều quan trọng cần lưu ý là hàm tạo trong Java không được kế thừa, không có thứ gọi là ghi đè hàm tạo trong
        Java.
   - Phạm vi truy cập của ghi đè phương thức: lớp cha chưa phạm vi truy cập là public và protected thì lớp con mới
     truy cập được vào.
   - Ghi đè phương thức abstract:
      + các lớp trừu tượng được tạo ra để trở thành siêu lớp của các lớp khác. Và nếu một lớp chứa một phương thức
        trừu tượng thì bắt buộc phải ghi đè lên nó.

## 3. Java super Keyword

   - Từ khóa super trong Java được sử dụng trong các lớp con để truy cập các thành viên của lớp cha (thuộc tính,
     hàm tạo và phương thức)
   - Sử dụng super:
      + Để gọi phương thức của lớp cha được ghi đè trong lớp con.
      + Để truy cập thuộc tính của lớp cha nếu cả lớp cha và lớp con có thuộc tính cùng tên.
      + Để gọi một cách rõ ràng lớp cha no-arg (mặc định) hoặc hàm tạo được tham số hóa từ hàm tạo của lớp con
   - việc sử dụng super() là không bắt buộc. Ngay cả khi super() không được sử dụng trong hàm tạo của lớp con, trình
     biên dịch sẽ gọi ngầm hàm tạo mặc định của lớp cha.
   - Trình biên dịch có thể tự động gọi hàm tạo không có đối số. Tuy nhiên, nó không thể gọi các hàm tạo được tham
     số hóa.

## 4. Java Abstract

   - Java Abstract Class:
   - Lớp trừu tượng trong Java không thể được khởi tạo.
   - Không thể tạo đối tượng của lớp trừu tượng.
   - Sử dụng từ khóa abstract để khai báo một lớp trừu tượng.
   - Một lớp trừu tượng có thể có cả phương thức thông thường và phương thức trừu tượng.
   - Một lớp abstract không bị bắt buộc override những phương thức của lớp cha interface.
   - Một lớp cụ thể bắt buộc phải override những phương thức của lớp cha interface.
     *) Java Abstract Method
   - Một phương thức không có phần thân được gọi là phương thức abstract
   - Nếu một lớp chứa một phương thức trừu tượng thì lớp đó phải được khai báo là trừu tượng
   - Mặc dù các lớp trừu tượng không thể được khởi tạo nhưng có thể tạo các lớp con từ nó
   - Có thể truy cập các thành viên của lớp trừu tượng bằng cách sử dụng đối tượng của lớp con.
     *) Implementing Abstract Methods
   - Nếu lớp trừu tượng bao gồm bất kỳ phương thức trừu tượng nào thì tất cả các lớp con được kế thừa từ lớp cha trừu
     tượng phải cung cấp việc triển khai phương thức trừu tượng (ghi đè).
   - Nếu lớp con được khai báo là trừu tượng thì không bắt buộc phải ghi đè các phương thức trừu tượng.
     *) Truy cập Contructor của lớp trừu tượng
   - Một lớp trừu tượng có thể có các hàm tạo như lớp thông thường. Và, chúng ta có thể truy cập hàm tạo của một lớp
     trừu tượng từ lớp con bằng cách sử dụng từ khóa super.
   - Chú ý: super phải luôn là câu lệnh đầu tiên của hàm tạo của lớp con.
     *) Java Abtraction
   - Công dụng chính của các lớp và phương thức trừu tượng là đạt được tính trừu tượng trong Java.
   - Tính trừu tượng là một khái niệm quan trọng của lập trình hướng đối tượng, cho phép chúng ta ẩn đi những chi tiết
     không cần thiết và chỉ hiển thị những thông tin cần thiết.
   - Chú ý: Có thể sử dụng các giao diện để đạt được tính trừu tượng trong Java

## 5. Java Interface

   - Một interface là một lớp hoàn toàn trừu tượng. Nó gồm các phương thức trừu tượng (phương thức không có phần thân)
   - Sử dụng từ khóa interface để tạo một interface trong Java.
     *) Implementing an Interface
   - Giống như lớp abstract, không thể khởi tạo đối tượng từ interface
   - Để sử dụng một interface, lớp khác phải implement nó. Sử dụng từ khóa implements để implement một interface
     *) Imlementing Multiple Interface
   - Một class có thể implement nhiều interface.
   - Giống như class, interface có thể kế thừa interface khác.
   - Bất kì class nào implement lớp trừu tượng thì đều phải triển khai tất cả các phương thức trừu tượng của lớp đó.
   - ưu điểm của Interface:
      + Interface giúp tạo tính trừu tượng trong Java.
      + Hàm getArea() tính diện tích của đa giác, cách tính của diện tích là khác nhau đối với đa giác khác nhau.
        việc triển khai getArea() là độc lập với nhau.
   - Bất kỳ lớp nào implement lớp cha thì đề phải triển khai phương thức của lớp cha.
   - Interface được sử dụng để đạt được tính đa kế thừa trong Java
   - Chú ý:
      + Tất cả phương thức trong một interface đều ngầm định là public.
      + Tất cả thuộc tính trong một interface đều ngầm định là public static final.
        *) default method
   - Với việc phát hành Java 8, giờ đây chúng ta có thể thêm các phương thức triển khai bên trong một giao diện.
     Các phương thức này được gọi là phương thức mặc định. Để khai báo các phương thức mặc định bên trong giao diện,
     chúng ta sử dụng từ khóa default.
     public default void getSides() {
     // body of getSides()
     }
   - Phương thức default trong interface.
      + Cần có phương thức default để chúng ta có thể thêm phương thức vào interface một cách dễ dàng mà các lớp khác
        khi implements lại imterface sẽ không cần phải triển khai phương thức đó nữa.
      + Phương thức default giống như các phương thức thông thường.
        *) private and static Methods in Interface
   - Có thể truy cập các phương thức static của giao diện bằng cách sử dụng các tham chiếu của nó.

## 6. Java polymorphism (Tính đa hình)

   - Cùng một thực thể (phương thức, toán tử hoặc đối tượng) có thể thực hiện các thao tác khác nhau trong các tình
     huống khác nhau.
   - Tại sao cần tính đa hình?
      + Ví dụ cần tính diện tích mỗi hình (chữ nhật, tròn, vuông, ...) thì tính đa hình sẽ làm tốt việc này. Chỉ cần
        tạo một phương thức tính diện tích, mỗi hình sẽ thực hiện tính diện tích theo cách khác nhau.

## 7. Java Encapsulation (Tính đóng gói)

   - Đóng gói đề cập đến việc gói các trường và phương thức bên trong một lớp duy nhất.
   - Nó ngăn chặn các lớp bên ngoài truy cập và thay đổi các trường và phương thức của một lớp. Điều này cũng giúp đạt
     được việc ẩn dữ liệu.
   - Mọi người thường coi đóng gói là ẩn giấu dữ liệu nhưng điều đó không hoàn toàn đúng. Đóng gói đề cập đến việc gộp
     các trường và phương thức liên quan lại với nhau. Điều này có thể được sử dụng để đạt được việc ẩn dữ liệu. Bản thân
     việc đóng gói không phải là che giấu dữ liệu.
   - Why Encapsulation?:
      + Giúp giữ các trường và phương thức liên quan lại với nhau, làm cho mã sạch hơn và dễ đọc hơn.
      + Nó giúp kiểm soát các giá trị của các trường dữ liệu => private
      + Các phương thức getter và setter cung cấp quyền truy cập chỉ đọc hoặc chỉ ghi vào các trường lớp
      + Các thành phần (gói) tách rời này có thể được phát triển, thử nghiệm và gỡ lỗi một cách độc lập và đồng thời.
        Và bất kỳ thay đổi nào trong một thành phần cụ thể đều không có bất kỳ ảnh hưởng nào đến các thành phần khác.
      + Ẩn giấu dữ liệu bằng từ khóa private để các lớp khác không thể truy cập từ bên ngoài.
   - Data hiding:
      + Ẩn dữ liệu là một cách hạn chế quyền truy cập của các thành viên dữ liệu của chúng tôi bằng cách ẩn chi tiết
        triển khai. Chúng ta sử dụng access modifiers để ẩn dữ liệu.

# VI. OOP(3)

## 1. Java Nested and Inner Class (Lớp lồng nhau và lớp bên trong Java)

   - Có thể định nghĩa một lớp trong một lớp khác.
     
     `class OuterClass {
        // ...
        class NestedClass {
            // ...
        }
     }`
     
     - Có hai loại lớp lồng nhau có thể tạo:
       + Non-static nested class (inner class)
       + Static nested class
     - Non-static nested class:
       + Lớp lồng nhau không tĩnh là một lớp trong một lớp khác. Nó có quyền truy cập vào các thành viên của lớp kèm
       theo (lớp bên ngoài). Nó thường được gọi là lớp bên trong.
       + Vì inner class tồn tại bên trong lớp bên ngoài nên trước tiên bạn phải khởi tạo lớp bên ngoài để khởi tạo
       lớp bên trong.
       + Truy cập thành viên của outer class trong innerclass: có thể truy cập các thành viên của outer class bằng
       cách sử dụng từ khóa this.
     - Static Nested Class:
       + Có thể định nghĩa một static class bên trong một lớp khác. Lớp như vậy được gọi là static nested class. Các
       static nested class lớp bên trong tĩnh
       + Không giống như inner class, static nested class không thể truy cập các biến thành viên của outer class.
       Đó là vì static nested class không yêu cầu bạn tạo một thể hiện của outer class.
     - Chú ý:
       + Java coi lớp bên trong như một thành viên bình thường của một lớp. Chúng giống như các phương thức và biến
       được khai báo bên trong một lớp.
       + Vì các lớp bên trong là thành viên của lớp bên ngoài nên có thể áp dụng bất kỳ công cụ sửa đổi truy cập
       nào như private, protected cho lớp bên trong của mình, điều này không thể thực hiện được trong các lớp thông
       thường.
       + Vì lớp lồng nhau là thành viên của lớp bên ngoài bao quanh nó nên bạn có thể sử dụng ký hiệu dấu chấm (.) để
       truy cập lớp lồng nhau và các thành viên của nó.
       + Việc sử dụng lớp lồng nhau sẽ làm cho mã của bạn dễ đọc hơn và cung cấp khả năng đóng gói tốt hơn.
       + Các lớp lồng nhau không tĩnh (các lớp bên trong) có quyền truy cập vào các thành viên khác của lớp bên
       ngoài/lớp kèm theo, ngay cả khi chúng được khai báo là riêng tư.

## 2. Java Static Class

   - Nested Class có 2 loại
      + Nested non-static class (Inner class)
      + Nested static class.
   - Java Nested Static Class:
      + Chỉ các lớp lồng nhau mới được phép static
      + Giống như các lớp thông thường, các lớp lồng nhau tĩnh có thể bao gồm cả các trường và phương thức tĩnh và
        không tĩnh.
      + Các lớp lồng nhau tĩnh được liên kết với lớp bên ngoài.
      + Để truy cập lớp lồng tĩnh, chúng ta không cần các đối tượng của lớp bên ngoài.
   - Truy cập các thành viên của lớp ngoài:
      + Các lớp lồng nhau tĩnh được liên kết với lớp bên ngoài. Đây là lý do tại sao các lớp lồng nhau tĩnh chỉ có
        thể truy cập các thành viên lớp (trường và phương thức tĩnh) của lớp bên ngoài.
      + Không thể truy cập các phương thức không tĩnh của outer class từ static classes.
   - Static Top-level Class: (Lớp cấp cao nhất tĩnh)
      + Chỉ các lớp lồng nhau mới có thể có static. Không thể có static top-level classes.

## 3. Java Anonymous Class (Lớp ẩn danh Java)

   - Một lớp có thể chứa một lớp khác được gọi là lớp lồng nhau. Có thể tạo một lớp lồng nhau mà không cần đặt tên.
   - Một lớp lồng nhau không có tên nào được gọi là lớp ẩn danh.
   - Một lớp ẩn danh phải được định nghĩa bên trong một lớp khác. Do đó, nó còn được gọi là lớp bên trong ẩn danh.
   - Cú pháp của nó là:
     class outerClass {
     // defining anonymous class
     object1 = new Type(parameterList) {
     // body of the anonymous class
     };
     }
     Đoạn mã trên tạo một đối tượng, object1, của một lớp ẩn danh khi chạy.
   - Các lớp ẩn danh thường extend subclasses  hoặc implement interfaces:
      + a superclass that an anonymous class extends
      + an interface that an anonymous class implements
   - Các lớp ẩn danh được định nghĩa bên trong một biểu thức. Vì vậy, dấu chấm phẩy được sử dụng ở cuối các lớp ẩn danh
     để biểu thị phần cuối của biểu thức.
   - ưu điểm:
      + Trong các lớp ẩn danh, các đối tượng được tạo bất cứ khi nào chúng được yêu cầu. Nghĩa là, các đối tượng được
        tạo ra để thực hiện một số nhiệm vụ cụ thể.
      + Các lớp ẩn danh cũng giúp chúng ta làm cho mã của mình ngắn gọn hơn.

## 4. Java Singleton Class (Lớp đơn Java)

   -  Singleton là một mẫu thiết kế đảm bảo rằng một lớp chỉ có thể có một đối tượng.
   - Để tạo một lớp singleton, một lớp phải triển khai các thuộc tính sau:
      + Tạo một private constructor của lớp để hạn chế việc tạo đối tượng bên ngoài lớp.
      + Tạo một private attribute của loại lớp tham chiếu đến một đối tượng.
      + Tạo một public static method cho phép chúng ta tạo và truy cập đối tượng chúng ta đã tạo. Bên trong phương
        thức, chúng ta sẽ tạo một điều kiện để hạn chế chúng tạo thêm một đối tượng.
   - Use of Singleton in Java
      + Singletons có thể được sử dụng khi làm việc với cơ sở dữ liệu. Chúng có thể được sử dụng để tạo nhóm kết nối
        nhằm truy cập cơ sở dữ liệu trong khi sử dụng lại cùng một kết nối cho tất cả các máy khách.
   - Chú ý: Điều quan trọng cần lưu ý là chỉ có một số trường hợp (như logging) trong đó các singleton có ý nghĩa.
     Nên tránh sử dụng hoàn toàn singleton nếu không chắc chắn có nên sử dụng chúng hay không.

## 5. Java enums

   - enum (viết tắt của enumeration) là loại có một tập hợp các giá trị không đổi cố định.
   - Sử dụng từ khóa enum để khai báo enum
     enum Size {
     SMALL, MEDIUM, LARGE, EXTRALARGE
     }
   - Các giá trị này bên trong dấu ngoặc nhọn được gọi là hằng số enum (giá trị).
   - Các hằng số enum thường được biểu thị bằng chữ hoa.
   - Enum Class in Java:
      + Các loại enum được coi là một loại lớp đặc biệt. Nó đã được giới thiệu cùng với việc phát hành Java 5
      + Một lớp enum có thể bao gồm các phương thức và trường giống như các lớp thông thường.
      + Khi chúng ta tạo một enum class, trình biên dịch sẽ tạo các thể hiện (đối tượng) của từng hằng số enum.
        Ngoài ra, theo mặc định, tất cả hằng số enum luôn ở trạng thái public static final.
   - Chú ý: Giống như các lớp thông thường, một lớp enum cũng có thể bao gồm các hàm tạo.
   - Methods of Java Enum Class: Có một số phương thức được xác định trước trong các lớp enum có sẵn để sử dụng.
      + ordinal(): phương thức trả về vị trí của hằng số enum
      + compareTo(): phương thức so sánh các hằng số enum dựa trên giá trị thứ tự của chúng.
      + toString(): phương thức trả về biểu diễn chuỗi của hằng số enum
      + name(): phương thức trả về tên đã xác định của hằng số enum ở dạng chuỗi. Giá trị trả về từ phương thức
        name() là final.
      + valueOf(): phương thức lấy một chuỗi và trả về một hằng số enum có cùng tên chuỗi.
      + values(): phương thức trả về một mảng kiểu enum chứa tất cả các hằng số enum
   - Why Java Enums?:
      + enum được giới thiệu để thay thế việc sử dụng hằng số int.
      + Ngoài ra, enum cung cấp compile-time type safety.

## 6. Java enum Constructor

   - Một lớp enum có thể bao gồm một hàm tạo giống như một lớp thông thường. Các hàm tạo enum này là:
      + private - accessible within the class
      + package-private - accessible within the package

## 7. Java enum Strings

   - Có thể lấy biểu diễn chuỗi của các hằng enum bằng phương thức toString() hoặc phương thức name()
   - Thay đổi giá trị chuỗi mặc định của enum:
      + Chúng ta có thể thay đổi cách biểu diễn chuỗi mặc định của hằng enum bằng cách ghi đè phương thức toString().
   - Không thể ghi đè phương thức name(). Đó là vì phương thức name() là final

## 8. Java Reflection

   - sự phản chiếu cho phép chúng ta kiểm tra và thao tác các lớp, giao diện, hàm tạo, phương thức và trường trong
     thời gian chạy.
   - Có một lớp trong Java tên là Class lưu giữ tất cả thông tin về các đối tượng và lớp trong thời gian chạy. Đối
     tượng của Class có thể được sử dụng để thực hiện sự phản chiếu.

# VII. Java Exception Handling (Xử lý ngoại lệ)

## 1. Java Exception

   - Exception là những vấn đề xảy ra trong quá trình thực hiện chương trình, làm cho luồng chạy không được đúng chuẩn.
    _**Phân cấp exception**_:
   - Gốc của exception là Throwable:
       + Error
       + Exception: RuntimeException và IOEException
   - Error: là các ngoại lệ không được đặt bẫy, thường nằm ngoài tầm kiểm soát của ngời lập trình viên.
   - Exception: có thể được chương trình phát hiện và xử lý. Khi một ngoại lệ xảy ra, nó sẽ tạo ra một đối tượng.
     Đối tượng này được gọi là đối tượng ngoại lệ, nó chứa thông tin về ngoại lệ như tên, mô tả về ngoại lệ, trạng thái
     của chương trình khi ngoại lệ xảy ra.
   - Runtime Exception: xảy ra do lỗi lập trình. (được gọi là các ngoại lệ không được kiểm tra)
     + Những ngoại lệ này xảy ra tại thời gian chạy chương trình. Ví dụ:
     + IllegalArgumentException: sử dụng API không đúng cách.
     + NullPointerException: truy cập con trỏ null (thiếu khởi tạo một biến)
     + ArrayIndexOutOfBoundsException: truy cập mảng ngoài giới hạn
     + ArithmeticException: chia một số cho 0
     + "Nếu đây là một ngoại lệ trong thời gian chạy thì đó là lỗi của bạn."
   - IOE Exception: ngoại lệ được kiểm tra.
     + Chúng được trình biên dịch kiểm tra tại thời điểm biên dịch và lập trình viên được nhắc xử lý các ngoại lệ này.
     
## 2. Java Exception Handling

   - Những cách xử lý ngoại lệ:
      + try...catch block
      + finally block
      + throw and throws keyword
   **try ... catch block**:
   - Được sử dụng để xử lý các ngoại lệ trong Java.
   - Đặt code có thể xảy ra ngoại lệ trong khối try. Một khối try thường có một khối catch.
   - Khi mội exception xảy ra, nó bị bắt bỏi khối catch. Khối catch không thể được sử dụng nếu không có khối try.
   - khi một exception xảy ra, những dòng code còn lại trong khối try được bỏ qua. Khối catch sẽ bắt những ngoại lệ và
thực thi những câu lệnh trong khối catch.
   - Nếu không có câu lệnh nào trong khối try tạo ra ngoại lệ thì khối catch sẽ được bỏ qua.
   **finally:**
   - Khối finally luôn được thực thi bất kể có ngoại lệ hay không. 
   - Khối finally là không bắt buộc.
        + Đối với mỗi try khối, chỉ có thể có một finally khối.
        + Nếu một ngoại lệ xảy ra, khối finally sẽ được thực thi sau khối try...catch đó. Ngược lại, nó sẽ được thực thi 
       sau khối try. Đối với mỗi khối try, chỉ có thể có một khối finally.
   **Java throw and throws keyword**:
        + throw được sử dụng để ném một ngoại lệ một cách rõ ràng
        + Khi chúng ta ném ra một ngoại lệ, luồng chương trình sẽ chuyển từ khối try sang khối catch.

## 3. Java try ... catch

   - Khối try ... catch được sử dụng để xử lý các trường hợp ngoại lệ, ngăn chặn việc chấm dứt chương trình một cách 
  bất thường.
     `try{
        // code có thể tạo ra ngoại lệ
       }
       catch(exception) {
          // code xử lý sau khi thực thi chương trình có ngoại lệ xảy ra.
       }`
   - In Java, we can use a try block without a catch block. However, we cannot use a catch block without a try block.
   - Có thể sử dụng khối try cùng với khối finally. The finally block is always executed whether there is an exception 
inside the try block or not.

## 4. Java throw and throws

   - các ngoại lệ có thể được phân thành hai loại: Ngoại lệ được kiểm tra, ngoại lệ không được kiểm tra.
      + Ngoại lệ không được kiểm tra: Chúng không được kiểm tra tại thời gian biên dịch mà tại thời gian chạy
      + Ngoại lệ được kiểm tra:  Chúng được kiểm tra tại thời điểm biên dịch
   - Java throws keyword
      - Cú pháp:
        `accessModifier returnType methodName() throws ExceptionType1, ExceptionType2 … {
           // code
        }`
   - Java throws:
   - throw được sử dụng trong phương thức, throws được viết ở đầu phương thức.
   - Sử dụng throw khi đã biết trước một exception cụ thể có thể xảy ra. Ngược lại, khi không biết rõ cụ thể exception 
nào có thể xảy ra thì sử dụng throws.
   - throws thường được dùng với try catch để xử lý ngoại lệ một cách toàn diện.

## 5. Java catch Multiple Exceptions
   - Có thể viết được nhiều loại exception trong catch thông qua kí tự |
   - Cú pháp:
     `try {
        // code
     } catch (ExceptionType1 | ExceptionType2) {
        // catch block
    }`
   - Nếu đã sử dụng Exception trong khối catch thì không sử dụng ngoại lệ con cùng một khối catch, nếu không sẽ gặp lỗi
  biên dịch.

## 6. Java try-with-resources
   - try-with-resources là lệnh tự đóng tất cả các tài nguyên (resources) ở cuối câu lệnh. Tài nguyên là một đối tượng
   được đóng vào cuối chương trình.
   - cú pháp:
   `try (resource declaration) {
      // use of the resource
   } catch (ExceptionType e1) {
     // catch block
   }`
   - khai báo và khởi tạo tài nguyên (resources) trong mệnh đề try
   - chỉ định và xử lý tất cả các ngoại lệ có thể được đưa ra khi đóng tài nguyên.
   - Ngoại lệ bị loại bỏ:
     + các ngoại lệ có thể được loại bỏ khỏi try-with-resources:
       - test.txt không tìm thấy tập tin test.txt
       - đóng đối tượng bufferedReader
   - Nếu ngoại lệ được ném ra từ cả try và try-with-resources, ngoại lệ từ try sẽ được ném ra và ngoại lệ try-with-resources
   sẽ bị loại bỏ.
   - "Chatgpt: Trong Java, khi sử dụng try-with-resources, nếu ngoại lệ xảy ra trong khối try và đồng thời xảy ra ngoại lệ khi 
  đóng tài nguyên (resource), ngoại lệ gây ra khi đóng tài nguyên được gọi là "suppressed exception" (ngoại lệ bị kìm lại). 
  Các ngoại lệ bị kìm lại không ngăn các ngoại lệ khác trong khối try được bắt và xử lý. Thay vào đó, chúng được ghi lại 
  và có thể được truy cập thông qua phương thức getSuppressed() của ngoại lệ chính.
   - Truy xuất các ngoại lệ bị bỏ:
     +  sử dụng phương thức Throwable.getSuppressed() để loại bỏ ngoại lệ do try ném ra.
     + phương thức này trả về một mảng gồm tất cả các ngoại lệ bị loại bỏ.
   - try với nhiều resources: sử dụng dấu ; để phân tách

## 7. Java Annotation
   - Chú thích bắt đầu bằng @
   - Chúc thích bao gồm: thành viên, thuộc tính, tham số.
   - Chú thích đánh dấu, không chứ thành viên, phần tử. Chỉ sử dụng để đánh dấu một tuyên bố.
     + Cú pháp: @AnnotationName(). Vì những chú thích này không chứa các phần tử nên có thể loại trừ dấu ngoặc đơn
   - Chú thích phần tử đơn: chỉ chứa một phần tử\
     + Cú pháp: @AnnotationName(elementName = "elementValue")
     + Nếu chỉ có một phần tử thì quy ước đặt tên phần tử đó là value: @AnnotationName(value = "elementValue")
     + Trong trường hợp này, tên thành phần cũng có thể bị loại trừ. Tên phần tử sẽ làgiá trịtheo mặc định. 
     @AnnotationName("elementValue")
   - Chú thích nhiều phần tử:
     + Các chú thích này chứa nhiều phần tử được phân tách bằng dấu phẩy.
     + Cú pháp: @AnnotationName(element1 = "value1", element2 = "value2")
   - Vị trí chú thích:
     + Bất kỳ khai báo nào cũng có thể được đánh dấu bằng chú thích bằng cách đặt nó phía trên khai báo đó. Kể từ 
   Java 8, các chú thích cũng có thể được đặt trước một loại.
   - Gõ chú thích: Trước Java 8, chú thích chỉ có thể được áp dụng cho phần khai báo. Bây giờ, chú thích kiểu cũng có 
  thể được sử dụng. Điều này có nghĩa là chúng ta có thể đặt chú thích ở bất cứ nơi nào chúng ta sử dụng một loại.
     + Lời gọi hàm tạo: new @Readonly ArrayList<>()
     + Định nghĩa kiểu: @NonNull Chuỗi str;
    - Các loại chú thích:
     + Chú thích được xác định trước
     + Chú thích meta
     + Chú thích tùy chỉnh

## 8. Java Logging
   - Java cho phép chúng ta tạo và ghi lại các thông điệp và tệp tường trình thông qua quá trình ghi nhật ký.
   - Lớp này Loggercung cấp các phương thức để ghi nhật ký. Chúng ta có thể khởi tạo các đối tượng từ Loggerlớp và gọi 
  các phương thức của nó cho mục đích ghi nhật ký.
   - Có 7 cấp độ nhật ký cơ bản
   - Ưu điểm của việc ghi nhật ký
     + giúp theo dõi dòng chảy của chương trình
     + giúp nắm bắt mọi lỗi có thể xảy ra
     + cung cấp hỗ trợ chẩn đoán và gỡ lỗi vấn đề


# VIII. JAVA LIST

## 1. Java Collections Framework

   - Java collections framework cung cấp một tập hợp các giao diện và các lớp để triển khai các cấu trúc dữ liệu và 
thuật toán khác nhau.
   - Java collections framework cung cấp nhiều giao diện khác nhau. Các giao diện này bao gồm một số phương thức để 
thực hiện các thao tác khác nhau trên các bộ sưu tập.
   - Java Collection Interface:
      + Java không cung cấp các triển khai trực tiếp Collection interface nhưng cung cấp các triển khai các giao diện 
con của nó như List, Set và Queue.
    - Collections Framework Vs. Collection Interface:
      + The Collection interface is the root interface of the collections framework
      + Framework bao gồm các giao diện khác: Map and Iterator.
      + These interfaces may also have subinterfaces.

## 2. Java Collection Interface

## 3. Java List Interface

   - List interface là một bộ sưu tập có thứ tự cho phép chúng ta lưu trữ và truy cập các phần tử một cách tuần tự.
Nó kế thừa Collection interface.
   - Vì List là một giao diện nên chúng ta không thể tạo đối tượng từ nó.
   - Để sử dụng các chức năng của List interface, chúng ta có thể sử dụng các lớp sau:
      + ArrayList
      + LinkedList
      + Vector
      + Stack
   - we must import java.util.List package in order to use List.
      // ArrayList implementation of List
      List<String> list1 = new ArrayList<>();
   - Methods of List:
      + List interface bao gồm tất cả các phương thức của Collection interface. Đó là bởi vì Collection là một super 
interface of List.
   - Java List vs. Set:
      + Cả giao diện List và giao diện Set đều kế thừa giao diện Collection.
      + Lists có thể bao gồm các phần tử trùng lặp. Tuy nhiên, sets không thể có các phần tử trùng lặp.
      + Các phần tử trong list được lưu trữ theo một thứ tự nào đó. Tuy nhiên, các phần tử trong sets được lưu trữ theo 
nhóm giống như tập hợp trong toán học.

## 4. Java ArrayList

   - Sử dụng lớp ArrayList để triển khai chức năng của mảng có thể thay đổi kích thước.
   - Nó triển khai List interface của collections framework.
   - Java ArrayList Vs Array:
      + Trong Java, chúng ta cần khai báo kích thước của một mảng trước khi có thể sử dụng nó. Khi kích thước của mảng 
    đã được khai báo thì rất khó để thay đổi nó.
      + Để xử lý vấn đề này, chúng ta có thể sử dụng lớp ArrayList. Nó cho phép chúng ta tạo các mảng có thể thay đổi 
    kích thước.
      + Không giống như mảng, danh sách mảng có thể tự động điều chỉnh dung lượng khi chúng ta thêm hoặc xóa các phần 
    tử khỏi chúng. Do đó, danh sách mảng còn được gọi là mảng động.
   - Các thao tác cơ bản với ArrayList:
      + Add elements
        + Other way to add elements to arraylist:
      + Access elements
        + To access an element from the arraylist, we use the get() method of the ArrayList class.
      + Change elements
      + Remove elements
        + We can also remove all the elements from the arraylist at once:  removeAll(), clear().

## 5. Java Vector

   - The Vector class is an implementation of the List interface cho phép chúng ta tạo các mảng có thể thay đổi kích 
    thước tương tự như lớp ArrayList.
   - Java Vector vs. ArrayList:
      + Cả ArrayList và Vector đều triển khai List interface và cung cấp các chức năng giống nhau
      + Lớp Vector đồng bộ hóa từng hoạt động riêng lẻ. Điều này có nghĩa là bất cứ khi nào chúng ta muốn thực hiện một 
số thao tác trên vectơ, lớp Vector sẽ tự động áp dụng khóa cho thao tác đó.
      + Đó là bởi vì khi một luồng đang truy cập một vectơ và cùng lúc một luồng khác cố gắng truy cập vào nó, một ngoại
lệ có tên ConcurrentModificationException sẽ được tạo ra. Do đó, việc sử dụng khóa liên tục cho mỗi thao tác làm cho 
vectơ kém hiệu quả hơn.
      + Tuy nhiên, trong danh sách mảng, các phương thức không được đồng bộ hóa. Thay vào đó, nó sử dụng phương thức 
Collections.synchronizedList() để đồng bộ hóa toàn bộ danh sách.
   - Chú ý: Nên sử dụng ArrayList thay cho Vector vì vectơ kém hiệu quả hơn.
   - Add Elements to Vector
      + add(element) - adds an element to vectors
      + add(index, element) - adds an element to the specified position
      + addAll(vector) - adds all elements of a vector to another vector
   - Access Vector Elements:
      + get(index) - trả về một phần tử được chỉ định bởi chỉ mục
      + iterator() - trả về một đối tượng iterator để truy cập tuần tự các phần tử vectơ
   - Remove Vector Elements:
      + Remove(index) - xóa một phần tử khỏi vị trí đã chỉ định
      + RemoveAll() - xóa tất cả các phần tử 
      + clear() - xóa tất cả các phần tử. Nó hiệu quả hơn RemoveAll()

## 6. Java Stack

   - Java collections framework có một lớp có tên Stack cung cấp chức năng của cấu trúc dữ liệu ngăn xếp.
   - The Stack class extends the Vector class.

# IX. JAVA QUEUE

## 1. Java Queue Interface
   - quản lý phần tử theo cớ chế: First-In-First-Out (FIFO),phần tử đầu tiên được thêm vào hàng đợi là phần tử đầu tiên
   được lấy ra khỏi hàng đợi.
   - Phương thức:
   - add(): là một phương thức kế thừa từ Collection interface.
  sử dụng add() để thêm một phần từ vào hàng đợi, nếu hàng đợi đầy (đối với hàng đợi giới hạn kích thước), nó sẽ ném
  ra ngoại lệ, báo rằng không thể thêm phần tử.
   - offer(): là một phương thức trong Queue interface.
  sử dụng offer() để thêm một phần tử vào hàng đợi, nếu hàng đợi đầy, nó sẽ trả về false, không có ngoại lệ được ném ra.

## 2. Java PriorityQueue : Hàng đợi ưu tiên

   - Cấu trúc hàng đợi được sắp xếp dựa trên sự ưu tiên, các phần tử được sắp xếp theo một tiêu chí ưu tiên.
   - phần tử có ưu tiên cao nhất sẽ luôn được lấy ra trước.
   - sử dụng PriorityQueue để tạo hàng đợi ưu tiên.

## 3. Java Deque Interface
   - là interface trong java, đại diện cho một cấu trúc dữ liệu hàng đợi có khả năng thêm và loại bỏ phần tử ở cả 2 đầu.

## 3. Java LinkedList
   - cung cấp chức năng của cấu trúc dữ liệu danh sách được liên kết (liên kết đôi).
   - mỗi phần tử trong danh sách liên kết được gọi là một nút. gồm 3 trường:
     + Pre: lưu trữ địa chỉ của phần tử trước đó trong danh sách. phần tử đầu tiên là null
     + Next: Lưu trữ địa chỉ của phần tử tiếp theo trong danh sách. null cho phần tử cuối cùng.
     + Data: lưu trữ dữ liệu thực tế
   - Các phần tử trong danh sách liên kết không được lưu trữ theo thứ tự. chúng nằm rải rác và được kết nối thông qua
   các liên kết (Pre và Next).
   - Có chứa phần tử trùng lặp
   - Lưu ý: có thể tạo LinkedList bằng các giao diện trong Java:
       `// create linkedlist using List
       List<String> animals1 = new LinkedList<>();
        // creating linkedlist using Queue
        Queue<String> animals2 = new LinkedList<>();
        // creating linkedlist using Deque
        Deque<String> animals3 = new LinkedList<>();`
       Nếu linkedList được tạo bằng một giao diện thì không thể sử dụng các phương thức do các giao diện khác cung cấp.
   "animal1" không thể sử dụng các phương thức của Queue và Deque

## 4. Java ArrayDeque


## 5. Java BlockingQueue Interface (hàng đợi chặn)
   - mọi thao tác phải đợi cho đến khi được thực hiện thành công.
   - được sử dụng để quản lý và đồng bộ hóa việc chia sẻ dữ liệu giữa các tiến trình hoặc luồng.
   - được gọi là thread-safe collection  (an toàn theo luồng), nó hữu ích trong hoạt động đa luồng.
   - giả sử một luồng đang chèn các phần tử và luồng khác xóa phần tử khỏi hàng đợi, nếu luồng đầu tiên chạy chậm hơn
   thì blockingqueue sẽ khiến luồng thứ 2 đợi đến khi luồng thứ 1 hoàn thành.

## 6. Java ArrayBlocking Queue
   - bắt buộc phải cung cấp kích thước của mảng
   - put() và take() hỗ trợ hoạt động chặn trong arraybloking queue. giúp phân biệt arraybloking queue với hàng đợi
   thông thường khác.
   - Trong các quy trình đa luồng, chúng ta có thể sử dụng put()và take()chặn hoạt động của một luồng để đồng bộ hóa nó 
   với một luồng khác. Các phương thức này sẽ đợi cho đến khi chúng có thể được thực thi thành công.

## 7. Java LinkedBlockingQueue
   - không bắt buộc cung cấp kích thước mảng
   - giống với arrayBloking các phương thức, khác nhau:
   - arrayBloking: bắt buộc cố định kích thước hàng đợi
   - linkedBloking: không bắt buộc cố định
   - trong một số trường hợp khi cố định kích thước hàng đợi sẽ giúp hoạt động nhanh hơn

# X. JAVA MAP

## 1. Java Map Interface

   - cung cấp chức năng của cấu trúc dữ liệu bản đồ.
   - Các phần tử được lưu trữ theo cặp: key/value.
     + key là giá trị duy nhất được liên kết với các value riêng lẻ.
   - map không chứa các key trùng lặp. mỗi key được liên kết với một giá trị duy nhất
    keys  -   values
    us    -   United States
    br    -   Brazil
    es    -   Spain
   - Chú ý: Map có 3 loại khác nhau:
      + the set of keys
      + the set of values
      + the set of key/value
   - Các class triển khai Map: HashMap, EnumMap, LinkedHashMap, WeakHashMap, TreeMap

## 2. Java HashMap


## 3. Java LinkedHashMap
   - Dạng {five=5, three=3, seven=7, six=6} được sử dụng để biểu thị một Map trong ngôn ngữ Java, 
   - trong khi [five=5, three=3, seven=7, six=6] là một chuỗi đơn thuần biểu thị một danh sách cặp key-value.

## 4. Java WeakHashMap

## 5. Java Enum Map


## 6. Java SortedMap Interface


## 7. Java NavidableMap Interface


## 8. Java TreeMap


## 9. Java ConcurrentMap Interface

## 10. Java ConcurrentaHashMap
   - cung cấp map theo luồng, nhiều luồng có thể truy cập map cùng một lúc, không làm ảnh hưởng đến tính nhất quán trong
  map.
   - không yêu cầu thứ tự phần tử.

# XI. JAVA SET

## 1. Java Set Interface
   - Không chứa các phần tử trùng lặp
   - Set là một giao diện nên không tạo được đối tượng
   - Để sử dụng chức năng của set, sẽ sử dụng thông qua class implement Set:
     + HashSet
     + LinkedHashSet
     + EnumSet
     + TreeSet
   - Interface extend Set
     + SortedSet
     + NavigableSet

## 2. Java HashSet
   - Theo mặc định:
     + dung lượng của bộ băm sẽ là 16
     + hệ số tải sẽ là 0,75
   - Các phần tử trong cấu trúc dữ liệu hash không được lưu trữ theo thứ tự cố định và không có chỉ mục cho từng phần tử.

## 3. Java enumSet
   - enumSet không có các hàm tạo công khai. Phải sử dụng các phương thức được xác định trước để tạo một bộ enum.
   - enum cung cấp một cách hiệu quả để lưu trữ các giá trị enum
   - Một bộ enum chỉ lưu trữ các giá trị enum của một enum cụ thể, JVM đã biết tất cả các giá trị có thể có của tập hợp.
   - Đây là lý do tại sao các bộ enum được triển khai nội bộ dưới dạng một chuỗi bit. Bits chỉ định xem các phần tử có 
  trong tập enum hay không.
   - Bit của phần tử tương ứng được bật nếu phần tử đó có trong tập hợp.

## 4. Java LinkedHashSet
   - các phần tử được lưu trữ trong bảng băm tương tự như HashSet.
   - Danh sách liên kết xác định thứ tự các phần tử được chèn vào bảng băm.

## 5. Java SortedSet Interface
   - được sử dụng để lưu trữ các phần tử theo thứ tự nào đó trong một tập hợp.

## 6. Java NavigableSet Interface
   - cung cấp các tính năng để điều hướng giữa các phần tử đã đặt.

## 7. TreeSet

## 8. Thuật toán
   - Các thuật toán trong java là các phương thức tĩnh
   - sắp xếp: sort()
   - xáo trộn: shuffle()
   - thao tác dữ liệu:
     + reverse();
     + ...
   - binarySearch(): tìm kiếm nhị phân
   - ...
## 9. Java Iterator
   - has subinterface: ListIterator
   - methor:
     + hasNext();
     + next()
     + remove()
     + forEachRemaining()

## 10. Java Listlterator
   - cung cấp chức năng truy cập phần tử của danh sách.
   - Nó là hai chiều. Điều này có nghĩa là nó cho phép chúng ta lặp lại các phần tử của danh sách theo cả hai hướng.

