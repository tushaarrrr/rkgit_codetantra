import java.util.Scanner;
					System.out.println("Meters: "+object2.KMtoMeter(distance));
					break;
				case 3:
					System.out.println("Enter the distance in miles:");
					distance = scanner.nextInt();
					System.out.println("KM: "+object2.MilestoKM(distance));
					break;
				case 4:
					System.out.println("Enter the distance in KM:");
					distance = scanner.nextInt();
					System.out.println("Miles: "+object2.KMtoMiles(distance));
					break;
				default:
					System.out.println("Invalid choice");
			}
			
			
		}
		else if (input == 3){
			TimeConverter object3 = new TimeConverter();
			System.out.println("Choose the time conversion:");
			System.out.println("1. Hours to Minutes");
			System.out.println("2. Minutes to Hours");
			System.out.println("3. Hours to Seconds");
			System.out.println("4. Seconds to Hours");
			choice = scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the time in hours:");
					time=scanner.nextInt();
					System.out.println("Minutes: "+object3.HourstoMinutes(time));
					break;
				case 2:
					System.out.println("Enter the time in minutes:");
					time=scanner.nextInt();
					System.out.println("Hours: "+object3.MinutestoHours(time));
					break;
				case 3:
					System.out.println("Enter the time in hours:");
					time=scanner.nextInt();
					System.out.println("Seconds: "+object3.HourstoSeconds(time));
					break;
				case 4:
					System.out.println("Enter the time in seconds:");
					time=scanner.nextInt();
					System.out.println("Hours: "+object3.SecondstoHours(time));
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
		else {
			System.out.println("Invalid choice");
		}
        scanner.close();
	}


}