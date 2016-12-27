//Lukas Schulz 1. Semester
public class Raumschiff {
	//Deklarierung der Instanzvariablen
	private String name;
	private int laenge;
	private int breite;
	boolean triebwerke;
	private boolean hyperraum;

	//Konstruktor der Klasse Raumschiff
	public Raumschiff(String na, int lae, int bre, boolean tr, boolean hy){
		name=na;
		laenge=lae;
		breite=bre;
		triebwerke=tr;
		hyperraum=hy;
	}
	//Beschränkung um schlechten Namen zu vermeiden
	public void setname(String na){
		if(!na.equals("Kaan")){
			System.out.println("Name erfolgreich geändert");
			name = na;
		}
	}
	//Beschränkung um realistische Raumschiffgröße zu ermöglichen
	public void setlaenge(int lae){
		if(lae>10){
			laenge = lae;
		}
	}
	//Beschränkung um realistische Raumschiffgröße zu ermöglichen
	public void setbreite(int bre){
		if(bre>10){
			laenge = bre;
		}
	}
	//Beschränkung da die Triebwerke für den Sprung in den Hyperraum aktiv sein müssen
	public void sethyperraum(boolean hy){
		if(triebwerke){
			hyperraum = hy;
		}
	}



	//Getmethode um auf Private Varible zuzugreifen
	public String getname(){
		return name;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public int getlaenge(){
		return laenge;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public int getbreite(){
		return breite;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public boolean gethyperraum(){
		return hyperraum;
	}


	//Die Triebwerke werden gestartet
	void triebwerkeStarten(){
		triebwerke = true;
	}

	//Die Triebwerke werden ausgeschaltet
		void triebwerkeAusschalten(){
			triebwerke = false;
		}

	//Ein Hyperraumsprung wird ausgeführt
	void hyperraumsprung(){
		if(triebwerke){
			hyperraum=true;
			System.out.println("Hyperraumantrieb aktiviert!");
			System.out.println("\nSysteminfo: \nDas Raumschiff fliegt mit 1.079.252.820 km/h.\n");

		}
		
	}
	//Die Geschwindigkeit wird angezeigt
	double geschwindigkeit(){
	double[] geschwindigkeit = new double[]{880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048, 1049, 1050, 1051, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 1071, 1072, 1073, 1074, 1075, 1076, 1077, 1078, 1079, 1080, 1081, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 1089, 1090, 1091, 1092, 1093, 1094, 1095, 1096, 1097, 1098, 1099, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 1111, 1112, 1113, 1114, 1115, 1116, 1117, 1118, 1119, 1120, 1121, 1122, };
		int rnd = (int)(Math.random()*geschwindigkeit.length);
		return geschwindigkeit[rnd];
		
		
	}
	void selbstzerstoerung(){
		System.out.println("Bumm!");
	}


}
