import java.io.*;
import java.util.Scanner;

class Calculation {
	final double ELEVATOR = 2770;
	double [][] heatingUsage = new double[4][4];
	double [][] waterUsage = new double[4][4];
	double [][] electricUsage = new double[4][4];
	double [][] sumT = new double[4][4];
	static double sumH = 0;
	static double sumW = 0;
	static double sumE = 0;

	double heatingR (int a, int b) {
		return 1725 * heatingUsage[a][b];
	}

	double waterR (int a, int b) {
		return 463 * waterUsage[a][b];
	}

	double electricR (int a, int b) {
		return 62 * electricUsage[a][b];
	}

	double sumTotalR (int a, int b) {
		return sumT[a][b];
	}

	double avgHeatingR () {
		return sumH/64;
	}

	double avgWaterR () {
		return sumW/64;
	}
	
	double avgElectricR () {
		return sumE/64;
	}

	double avgTotalR () {
		return ( (sumH + sumW + sumE)/64 + ELEVATOR );
	}
}

class FileMain extends Calculation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Calculation c1 = new Calculation();		//1��
		Calculation c2 = new Calculation();		//2��
		Calculation c3 = new Calculation();		//3��
		Calculation c4 = new Calculation();		//4��

		try {
			FileReader in = new FileReader("1��.txt");
			int x;
			String s = new String();
			while(( x= in.read() ) != -1)
				s = s + (char)x;
			in.close();


			String [] floor = s.split("\n");
			for (int i = 0; i < 4; i++) {
				String [] ho = floor[i].split(":");
				for (int j = 0; j < 4; j++) {
					String [] usage = ho[j].split(",");
					c1.heatingUsage[i][j] = Double.parseDouble(usage[0]);
					c1.waterUsage[i][j] = Double.parseDouble(usage[1]);
					c1.electricUsage[i][j] = Double.parseDouble(usage[2]);
					c1.sumT[i][j] = c1.heatingR(i, j) + c1.waterR(i, j) + c1.electricR(i, j);
					c1.sumH = c1.sumH + c1.heatingR(i, j);
					c1.sumW = c1.sumW + c1.waterR(i, j);
					c1.sumE = c1.sumE + c1.electricR(i, j);
				}
			}

		} catch(Exception e) {
			System.out.println("�����߻�");
		}

		try {
			FileReader in = new FileReader("2��.txt");
			int x;
			String s = new String();
			while(( x= in.read() ) != -1)
				s = s + (char)x;
			in.close();


			String [] floor = s.split("\n");
			for (int i = 0; i < 4; i++) {
				String [] ho = floor[i].split(":");
				for (int j = 0; j < 4; j++) {
					String [] usage = ho[j].split(",");
					c2.heatingUsage[i][j] = Double.parseDouble(usage[0]);
					c2.waterUsage[i][j] = Double.parseDouble(usage[1]);
					c2.electricUsage[i][j] = Double.parseDouble(usage[2]);
					c2.sumT[i][j] = c2.heatingR(i, j) + c2.waterR(i, j) + c2.electricR(i, j);
					c2.sumH = c2.sumH + c2.heatingR(i, j);
					c2.sumW = c2.sumW + c2.waterR(i, j);
					c2.sumE = c2.sumE + c2.electricR(i, j);
				}
			}

		} catch(Exception e) {
			System.out.println("�����߻�");
		}

		try {
			FileReader in = new FileReader("3��.txt");
			int x;
			String s = new String();
			while(( x= in.read() ) != -1)
				s = s + (char)x;
			in.close();


			String [] floor = s.split("\n");
			for (int i = 0; i < 4; i++) {
				String [] ho = floor[i].split(":");
				for (int j = 0; j < 4; j++) {
					String [] usage = ho[j].split(",");
					c3.heatingUsage[i][j] = Double.parseDouble(usage[0]);
					c3.waterUsage[i][j] = Double.parseDouble(usage[1]);
					c3.electricUsage[i][j] = Double.parseDouble(usage[2]);
					c3.sumT[i][j] = c3.heatingR(i, j) + c3.waterR(i, j) + c3.electricR(i, j);
					c3.sumH = c3.sumH + c3.heatingR(i, j);
					c3.sumW = c3.sumW + c3.waterR(i, j);
					c3.sumE = c3.sumE + c3.electricR(i, j);
				}
			}

		} catch(Exception e) {
			System.out.println("�����߻�");
		}

		try {
			FileReader in = new FileReader("4��.txt");
			int x;
			String s = new String();
			while(( x= in.read() ) != -1)
				s = s + (char)x;
			in.close();


			String [] floor = s.split("\n");
			for (int i = 0; i < 4; i++) {
				String [] ho = floor[i].split(":");
				for (int j = 0; j < 4; j++) {
					String [] usage = ho[j].split(",");
					c4.heatingUsage[i][j] = Double.parseDouble(usage[0]);
					c4.waterUsage[i][j] = Double.parseDouble(usage[1]);
					c4.electricUsage[i][j] = Double.parseDouble(usage[2]);
					c4.sumT[i][j] = c4.heatingR(i, j) + c4.waterR(i, j) + c4.electricR(i, j);
					c4.sumH = c4.sumH + c4.heatingR(i, j);
					c4.sumW = c4.sumW + c4.waterR(i, j);
					c4.sumE = c4.sumE + c4.electricR(i, j);
				}
			}


		} catch(Exception e) {
			System.out.println("�����߻�");
		}



		int a = scan.nextInt();
		int b = scan.nextInt();

		String r = new String();
		String t = new String();

		r = "*****4�� " + (a+1) + "0" + (b+1)+ "ȣ ������ ����*****";
		t = "�°��� ������: " + c4.ELEVATOR + "\n�����: " + c4.heatingR (a,b) + "\n������: " + c4.waterR (a,b)
			+ "\n���⼼: "  + c4.electricR(a,b) + "\n���뺰 �� �հ�: " + c4.sumTotalR (a,b) 
			+ "\n\n����� ���: " + c1.avgHeatingR() + "\n������ ���: " + c1.avgWaterR() + "\n���⼼ ���: " 
			+ c1.avgElectricR() + "\n�� �հ� ���: " + c1.avgTotalR();

		System.out.println("\n" + r + "\n");
		System.out.println(t);


		try {
			FileWriter out = new FileWriter("������ ����.txt");
			out.write(r);
			out.write("\n\n");
			out.write(t);
			out.close();
			System.out.println("����Ϸ�~");
		} catch(Exception e) {
			System.out.println("�����߻�");
		}

	}
}