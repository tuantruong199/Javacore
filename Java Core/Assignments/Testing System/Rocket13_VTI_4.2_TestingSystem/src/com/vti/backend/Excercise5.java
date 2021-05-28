package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.enity.Cadres;
import com.vti.enity.Cadres.Gender;
import com.vti.enity.Engineer;
import com.vti.enity.Worker;

public class Excercise5 {

	private Scanner sc;
	private ArrayList<Cadres> ArrayCadres;

	public Excercise5() {
		sc = new Scanner(System.in);
		ArrayCadres = new ArrayList<Cadres>();
	}

	public void question2() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
			System.out.println("=== 1. Thêm mới cán bộ. ==============================================");
			System.out.println("=== 2. Tìm kiếm theo họ tên. =========================================");
			System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===================");
			System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===================");
			System.out.println("=== 5. Thoát khỏi chương trình. ======================================");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addCadres();
				break;
			case 2:
				findByName();
				break;
			case 3:
				printListCadres();
				break;
			case 4:
				deleteByName();
				System.out.println("Moi nhap can bo");
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	private void deleteByName() {
		
		//for (Cadres cadres : ArrayCadres) {
		//	if (cadres.getName().equals(deleteName)) {
		//		ArrayCadres.remove(cadres);
		//	}
		//}
		System.out.println("Nhập tên cần xóa :");
		String deleteName= sc.next();
		Iterator<Cadres> iterator = ArrayCadres.iterator();
		while (iterator.hasNext()) {
			Cadres cadres = (Cadres) iterator.next();
			if (cadres.getName().equals(deleteName)) {
						ArrayCadres.remove(cadres);
					}
		}
	}

	private void findByName() {
		System.out.println("Nhập tên cần tìm kiếm :");
		String findname = sc.next();
		for (Cadres cadres : ArrayCadres) {
			if (cadres.getName().equals(findname)) {
				System.out.println(cadres);
			}
		}

	}

	private void addCadres() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
			System.out.println("=== 1. Thêm công nhân. ===============================================");
			System.out.println("=== 2. Thêm kỹ sư. ===================================================");
			System.out.println("=== 3. Thêm nhân viên. ===============================================");
			System.out.println("=== 4. Thoát khỏi chương trình. ======================================");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Mời nhập tên công nhân :");
				String nameWorker = sc.next();
				System.out.println("Mời nhập tuổi công nhân :");
				int ageWorker = sc.nextInt();
				System.out.println("Mời nhập giới tính : 1.MALE 2.FEMALE 3.UNKNOW");
				int flaggender = sc.nextInt();
				Gender numgender = null;
				switch (flaggender) {
				case 1:
					numgender = Gender.MALE;
					break;
				case 2:
					numgender = Gender.FEMALE;
					break;
				case 3:
					numgender = Gender.UNKNOW;
					break;
				}
				System.out.println("Mời nhập địa chỉ công nhân :");
				String addressWorker = sc.next();
				System.out.println("Nhập cấp bậc công nhân : ");
				int rankWorker = sc.nextInt();
				Cadres Worker = new Worker(nameWorker, ageWorker, numgender, addressWorker, rankWorker);
				ArrayCadres.add(Worker);
				break;
			case 2:
				System.out.println("Mời nhập tên kỹ sư :");
				String nameEngineer = sc.next();
				System.out.println("Mời nhập tuổi kỹ sư :");
				int ageEngineer = sc.nextInt();
				System.out.println("Mời nhập giới tính : 1.MALE 2.FEMALE 3.UNKNOW");
				int flagEngineer = sc.nextInt();
				Gender genderEngineer = null;
				switch (flagEngineer) {
				case 1:
					genderEngineer = Gender.MALE;
					break;
				case 2:
					genderEngineer = Gender.FEMALE;
					break;
				case 3:
					genderEngineer = Gender.UNKNOW;
					break;
				}
				System.out.println("Mời nhập địa chỉ kỹ sư :");
				String addressEngineer = sc.next();
				System.out.println("Nhập ngành đào tạo : ");
				String training_industry = sc.next();
				Cadres Engineer = new Engineer(nameEngineer, ageEngineer, genderEngineer, addressEngineer,
						training_industry);
				ArrayCadres.add(Engineer);
				break;
			case 3:
				break;
			case 4:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	private void printListCadres() {
		for (Cadres cadres : ArrayCadres) {
			System.out.println(cadres);
		}

	}
}
