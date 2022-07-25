public class Student {
    private  int id;
  private   String name;
   private String phone;
   private String course;
  private   String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public  void  printMyInfo(){

        System.out.println("ID: "+this.id);
        System.out.println("NAME: "+this.name);
        System.out.println("Course: "+this.course);
        System.out.println("Phone: "+this.phone);
        System.out.println("Address: "+this.address);
    }

}
