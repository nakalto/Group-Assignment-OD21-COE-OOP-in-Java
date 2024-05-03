public class EncapTest{
private String name;
private String idNum;
private int age;
public int getAge(){
return age;
}
publicString getName(){
return name;
}
publicString getIdNum(){
return idNum;
}
publicvoid setAge(int newAge){
age = newAge;
}
publicvoid setName(String newName){
  name = newName;
}
public void setIdNum(String newId){
idNum = newId;
}
}
public class RunEncap{
public static void main(String args[]){
EncapTest encap =new EncapTest();
encap.setName("James");
 encap.setAge(20);
 encap.setIdNum("12343ms");
System.out.print("Name : "+ encap.getName()+" Age : "+ encap.getAge());
}
}
