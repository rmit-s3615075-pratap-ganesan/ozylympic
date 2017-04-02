
public abstract class Participants {
private String id;      //unique id of Participants
private String name;    //name of participants
private int age;        //age of participant
private String state;   //state of participant

public Participants(String id,String name,int age,String state){
	this.id=id;
	this.name=name;
	this.age=age;
	this.state=state;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}


}
