public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		
		for(int i = 0; i < name.length();i++){
			for(int j = i + 1; j < name.length(); j++){
				char chr1 = name.charAt(i);
				char chr2 = name.charAt(j);
				
				if(chr1 == chr2){
					name = name.replace(chr2, ' ');
				}
			}
		}
		

	}

}
