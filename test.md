0~65536 Unicode (0x0000~0xffff)
static
switch (month) {
            case 2, 3, 4 -> System.out.println("Spring");
            case 5, 6, 7 -> System.out.println("Summer");
            case 8, 9, 10 -> System.out.println("Autumn");
            case 11, 12, 1 -> System.out.println("Winter");
            default -> System.out.println("Please input one right month to get corresponding season...");
创建一个类,无法通过构造方法创建对象,只能通过该类提供的getInstance()静态方法获得该类对象
----