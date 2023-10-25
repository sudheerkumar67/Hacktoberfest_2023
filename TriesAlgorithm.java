//Tries implementation in java
public class TrieNode {
	char data;
	boolean isTerminal;
	TrieNode childrenArr[]; //initialize an array of reference of the children
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		this.isTerminal = false;
		this.childrenArr = new TrieNode[26]; // create an array size of 26 where the reference of the child will be stored
		this.childCount = 0;
	}
}


public class TriesImplementation {
	//tries implementation through root
	private TrieNode root;
	
	public TriesImplementation() {
		root = new TrieNode('\0');
	}
	
	//insert
	
	private void insertHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A'; //here we just subtract the ascii value of 0th index character and ascii value of capital A(65) so that we get the index at array
		TrieNode child = root.childrenArr[childIndex];
		//if the character is not present in the array previously
		if(child == null) {
			child = new TrieNode(word.charAt(0));// creating node for 0th index element
			//after creating node add the element into the array at particular index
			root.childrenArr[childIndex] = child;
		}
		insertHelper(child, word.substring(1)); 
		//suppose you want to insert "NOTE" word then after creating node for N then remaining substring is "OTE" this is the meaning for substring(1) after that "TE" then "E"
		root.childCount++;
	}
	
	public void insert(String word) {
		insertHelper(root, word);
	}
	
	//Search
	
	private boolean searchHelper(TrieNode root, String word) {
		
		if(word.length() == 0) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.childrenArr[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child, word.substring(1));
	}
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	
	//Delete
	
	private void removeHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.childrenArr[childIndex];
		if(child == null) {
			return;
		}
		removeHelper(child, word.substring(1));
		if(! child.isTerminal && child.childCount==0) {
			root.childrenArr[childIndex] = null;
			root.childCount--;
		}
	}
	
	public void remove(String word) {
		removeHelper(root,word);
	}
}

public class TrieUse {

	public static void main(String[] args) {
		
		TriesImplementation t = new TriesImplementation();
		t.insert("NOTE");
		t.insert("AND");
		t.insert("AN");
		
		System.out.println(t.search("AND"));
		t.remove("AND");
		System.out.println(t.search("AND"));

	}

}
