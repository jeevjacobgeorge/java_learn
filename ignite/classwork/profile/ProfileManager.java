package ignite.classwork.profile;

public class ProfileManager implements CsvProfileHeader {
	private Profile [] profiles = new Profile[100];
	private int index = 0;
	
	public void importProfile(String path) {
		String profilesStr = new ProfileReader().read(path);
		String[] lines = profilesStr.split("\n");
		for (String line: lines) {
			 String[] fields = line.split(",",-1);
			 profiles[index++] = new Profile(fields[ID].trim(),fields[NAME].trim(),fields[COMPANY].trim(),fields[ROLE].trim());
		}
	}
	
	private int searchById(String id) {
		for(int i = 0; i < index; i++) {
			if(profiles[i].getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}
	public boolean editProfile(String id,String name,String company,String role) {
		int i = searchById(id);
		if (i !=-1) {
			Profile updatedProfile = profiles[i].clone();
			if (!name.isBlank()) 	updatedProfile.setName(name);
			if (!company.isBlank()) 	updatedProfile.setCompany(company);
			if (!role.isBlank()) 	updatedProfile.setRole(role);
			profiles[i] = updatedProfile;
			return true;
		}
		return false;
	}
	
	public void addProfile(Profile newProfile) {
		profiles[index++]=newProfile;
	}
	
	public void exportProfile(String path) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < index; i++) {
			Profile p = profiles[i];
			sb.append(String.format(
					"%s,%s,%s,%s\n",
					p.getId(),p.getName(),p.getCompany(),p.getRole()
					)
			);
		}
		ProfileWriter writer = new ProfileWriter();
		writer.write(sb.toString(),path);
	}
	
	public int getIndex() {
		return index;
	}
	public Profile [] getProfiles() {
		return profiles;
	}
	public Profile getProfileById(String id) {
		int i = searchById(id);
		if (i !=-1) {
			return profiles[i];
		}
		return null;
	}
	public Profile getProfilesByName(String name) {
		for(int i = 0; i < index; i++) {
			if(profiles[i].getName().equalsIgnoreCase(name)) {
				System.out.println(profiles[i]);
			}
		}
		return null;
	}

	
}
