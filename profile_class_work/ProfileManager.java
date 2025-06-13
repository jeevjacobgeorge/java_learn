package profile_class_work;

public class ProfileManager implements CsvProfileHeader {
	private Profile [] profiles = new Profile[100];
	private int index;
	public ProfileManager(String path) {
		String profiles_str = ProfileReader.read(path);
		String[] lines = profiles_str.split("\n");
		index = 0;
		for (String line: lines) {
			 String[] fields = line.split(",",-1);
//			 System.out.println(fields);
			 profiles[index++] = new Profile(Integer.parseInt(fields[ID].trim()),fields[NAME].trim(),fields[COMPANY].trim(),fields[ROLE].trim());
		}
	}

	public Profile[] getProfiles() {
		return profiles;
	}
	
	public int getIndex() {
		return index;
	}

	
}
