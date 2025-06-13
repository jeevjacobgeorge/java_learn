package ignite.classwork.profile;

public class ProfileManager implements CsvProfileHeader {
	private Profile [] profiles = new Profile[100];
	private int index;
	public Profile[] importProfile(String path) {
		String profilesStr = ProfileReader.read(path);
		String[] lines = profilesStr.split("\n");
		index = 0;
		for (String line: lines) {
			 String[] fields = line.split(",",-1);
			 profiles[index++] = new Profile(Integer.parseInt(fields[ID].trim()),fields[NAME].trim(),fields[COMPANY].trim(),fields[ROLE].trim());
		}
		return profiles;
	}
	
	public int getIndex() {
		return index;
	}

	
}
