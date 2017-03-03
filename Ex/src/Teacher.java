
public class Teacher {
    private String name,id;
    private char gender;
    private double height,weight;
    public void setName(String name1){
    	name = name1;
     }
    public void setId(String id1){
    	id = id1;
     }
    public void setGender(char gender1){
    	if(gender1=='1'){
    		System.out.println("male");
    	}
    	if(gender1=='0'){
    		System.out.println("female");
    	}
    	if(gender1=='2'){
    		System.out.println("none");
    	}
    	gender = gender1;
    }
    public void setHeight(double height1){
    	height = height1;
    }
    public void setWeight(double weight1){
    	weight = weight1;
    }
    public String getName(){
		return name;
    }
    public String getId(){
		return id;
    }
    public char getGender(){
    	return gender;
    }
    public double getHeight(){
    	return height;
    }
    public double getWeight(){
    	return weight;
    }
}
