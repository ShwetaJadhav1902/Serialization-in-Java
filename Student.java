package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

//public class Student implements Serializable{
public class Student implements Externalizable{
	//private transient int studId;
	private int studId;
	private String studName;
	private int studMarks;
	
	
	public Student(int studId, String studName, int studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}
	
	
	
	public Student() {
		super();
	}



	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(studName);
		out.writeInt(studMarks);
		
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	   studName=(String)in.readObject();
	   studMarks=in.readInt();
		
	}
	

}
