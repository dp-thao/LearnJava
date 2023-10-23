1. Java Collections Framework
    - Java collections framework cung cấp một tập hợp các giao diện và các lớp để triển khai các cấu trúc dữ liệu và thuật toán khác nhau.
    - Java collections framework cung cấp nhiều giao diện khác nhau. Các giao diện này bao gồm một số phương thức để thực hiện các thao tác khác nhau trên các bộ sưu tập.
    - Java Collection Interface:
      + Java không cung cấp các triển khai trực tiếp Collection interface nhưng cung cấp các triển khai các giao diện con của nó như List, Set và Queue.
    - Collections Framework Vs. Collection Interface:
      + The Collection interface is the root interface of the collections framework
      + Framework bao gồm các giao diện khác: Map and Iterator.
      + These interfaces may also have subinterfaces.
2. Java Collection Interface
3. Java List Interface
    - List interface là một bộ sưu tập có thứ tự cho phép chúng ta lưu trữ và truy cập các phần tử một cách tuần tự. Nó kế thừa Collection interface.
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
      + List interface bao gồm tất cả các phương thức của Collection interface. Đó là bởi vì Collection là một super interface of List.
    - Java List vs. Set:
      + Cả giao diện List và giao diện Set đều kế thừa giao diện Collection.
      + Lists có thể bao gồm các phần tử trùng lặp. Tuy nhiên, sets không thể có các phần tử trùng lặp.
      + Các phần tử trong list được lưu trữ theo một thứ tự nào đó. Tuy nhiên, các phần tử trong sets được lưu trữ theo nhóm giống như tập hợp trong toán học.
4. Java ArrayList
    - Sử dụng lớp ArrayList để triển khai chức năng của mảng có thể thay đổi kích thước.
    - Nó triển khai List interface của collections framework.
    - Java ArrayList Vs Array:
      + Trong Java, chúng ta cần khai báo kích thước của một mảng trước khi có thể sử dụng nó. Khi kích thước của mảng đã được khai báo thì rất khó để thay đổi nó.
      + Để xử lý vấn đề này, chúng ta có thể sử dụng lớp ArrayList. Nó cho phép chúng ta tạo các mảng có thể thay đổi kích thước.
      + Không giống như mảng, danh sách mảng có thể tự động điều chỉnh dung lượng khi chúng ta thêm hoặc xóa các phần tử khỏi chúng. Do đó, danh sách mảng còn được gọi là mảng động.
    - Các thao tác cơ bản với ArrayList:
      + Add elements
        + Other way to add elements to arraylist:
      + Access elements
        + To access an element from the arraylist, we use the get() method of the ArrayList class.
      + Change elements
      + Remove elements
        + We can also remove all the elements from the arraylist at once:  removeAll(), clear().
5. Java Vector
    - The Vector class is an implementation of the List interface cho phép chúng ta tạo các mảng có thể thay đổi kích thước tương tự như lớp ArrayList.
    - Java Vector vs. ArrayList:
      + Cả ArrayList và Vector đều triển khai List interface và cung cấp các chức năng giống nhau
      + Lớp Vector đồng bộ hóa từng hoạt động riêng lẻ. Điều này có nghĩa là bất cứ khi nào chúng ta muốn thực hiện một số thao tác trên vectơ, lớp Vector sẽ tự động áp dụng khóa cho thao tác đó.
      + Đó là bởi vì khi một luồng đang truy cập một vectơ và cùng lúc một luồng khác cố gắng truy cập vào nó, một ngoại lệ có tên ConcurrentModificationException sẽ được tạo ra. Do đó, việc sử dụng khóa liên tục cho mỗi thao tác làm cho vectơ kém hiệu quả hơn.
      + Tuy nhiên, trong danh sách mảng, các phương thức không được đồng bộ hóa. Thay vào đó, nó sử dụng phương thức Collections.synchronizedList() để đồng bộ hóa toàn bộ danh sách.
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
6. Java Stack
    - Java collections framework có một lớp có tên Stack cung cấp chức năng của cấu trúc dữ liệu ngăn xếp.
    - The Stack class extends the Vector class.