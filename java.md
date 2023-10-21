IV.OOP(1)

1. Lớp và đối tượng
2. Phương thức
3. Java Method Overloading (Nạp chồng phương thức)
    - Hai hoặc nhiều phương thức có thể có cùng tên trong cùng một lớp nếu chúng chấp nhận các đối số khác nhau.
      Tính năng này được gọi là nạp chồng phương thức.
    - Các cách nạp chồng phương thức:
        + Nạp chồng bằng thay đổi số lượng tham số
        + Nạp chồng bằng thay đổi kiểu dữ liệu của tham số
    - Không phải là nạp chồng phương thức nếu chỉ thay đổi kiểu trả về của phương thức. Phải có sự khác biệt về số lượng
      tham số.
4. Java Constructors (Hàm tạo)
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
5. Java Strings
    - Các chuỗi trong Java không phải là kiểu nguyên thủy (như int, char, v.v.). Thay vào đó, tất cả các chuỗi đều là
      đối tượng của một lớp được xác định trước có tên là String. Và tất cả các biến chuỗi đều là các thể hiện của lớp
      String.
    - Phương thức:
        + length() lấy độ dài của chuỗi
        + concat() nối chuỗi
        + equals() so sánh chuỗi
6. Java Access Modifiers (Phạm vi truy cập)
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
7. Java this Keyword (Từ khóa this)
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
8. Java final keyword (Từ khóa final)
    - Từ khóa final được sử dụng để biểu thị các hằng số. Nó có thể được sử dụng với các biến, phương thức và lớp.
    - Khi bất kỳ thực thể nào (biến, phương thức hoặc lớp) được khai báo final, nó chỉ có thể được gán một lần.
        + Biến final không thể được khởi tạo lại bằng giá trị khác
        + Phương thức final không thể ghi đè
        + Class final không thể được kế thừa
    - Chú ý: Nên sử dụng chữ hoa để khai báo các biến cuối cùng trong Java.
9. Java Recursion (Đệ quy)
    - Một phương thức gọi chính nó được gọi là phương thức đệ quy. Và quá trình này được gọi là đệ quy.
    - Để dừng cuộc gọi đệ quy, chúng ta cần cung cấp một số điều kiện bên trong phương thức. Nếu không, phương thức sẽ
      được gọi vô hạn.
10. Java instanceof Operator
    - Toán tử instanceof trong Java được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện của một lớp cụ
      thể hay không.
    - Cú pháp: objectName instanceOf className;
    - Có thể sử dụng toán tử instanceof để kiểm tra xem các đối tượng của lớp con có phải là một thể hiện của
      lớp cha hay không
    - Sử dụng để kiểm tra xem một đối tượng của một lớp có phải là một thể hiện của giao diện được lớp đó triển khai
      hay không.
    
II. OOP(2)
1. Java Inheritance (Kế thừa)
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
2. Java Method Overriding
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
3. Java super Keyword
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
4. Java Abstract
   *) Java Abstract Class
   - Lớp trừu tượng trong Java không thể được khởi tạo.
   - Không thể tạo đối tượng của lớp trừu tượng.
   - Sử dụng từ khóa abstract để khai báo một lớp trừu tượng.
   - Một lớp trừu tượng có thể có cả phương thức thông thường và phương thức trừu tượng.
   - Một lớp abstract không bị bắt buộc override những phương thức của lớp cha interface.
   - Một lớp cụ thể bắt buộc phải averride những phương thức của lớp cha interface.
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
5. Java Interface
    - Một interface là một lớp hoàn toàn trừu tượng. Nó gồm các phương thức trừu tượng (phương thức không có phần thân)
    - Sử dụng từ khóa interface để tạo một interface trong Java.
   *) Implementing an Interface
    - Giống như lớp abstract, không thể khởi tạo đối tượng từ interface
    - Để sử dụng một interface, lớp khác phải implement nó. Sử dụng từ khóa implements để implement một interface
   *) Imlementing Multiple Interface
    - Một class có thể implement nhiều interface.
    - Giống như class, interface có thể kế thừa interface khác.
    - Bất kì lớp nào interface lớp trừu tượng thì đều phải triển khai tất cả các phương thức trừu tượng của lớp đó.
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
6. Java polymorphism (Tính đa hình)
    - Cùng một thực thể (phương thức, toán tử hoặc đối tượng) có thể thực hiện các thao tác khác nhau trong các tình 
   huống khác nhau.
    - Tại sao cần tính đa hình?
         + Ví dụ cần tính diện tích mỗi hình (chữ nhật, tròn, vuông, ...) thì tính đa hình sẽ làm tốt việc này. Chỉ cần
      tạo một phương thức tính diện tích, mỗi hình sẽ thực hiện tính diện tích theo cách khác nhau.
7. Java Encapsulation (Tính đóng gói)
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