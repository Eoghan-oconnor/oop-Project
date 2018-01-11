package ie.gmit.sw.main;

public class Shingle {
	private int docId;
	private int hashcode;
	
	//Constructors
	public Shingle(int docId, int hashcode) {
		super();
		this.docId = docId;
		this.hashcode = hashcode;
	}
	
	//getters and setters
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public int getHashcode() {
		return hashcode;
	}
	public void setHashcode(int hashcode) {
		this.hashcode = hashcode;
	}

	
}
