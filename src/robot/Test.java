package robot;

public class Test {
    public static void main(String[] args) {
        moveRobot(new RobotConnectionManagerImpl(), 1, 2); // здесь цифры ничего не значат
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int count = 0;
        while (count < 3) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
            } catch (RobotConnectionException robotConnectionException) {
                count++;
                if (count == 3) {
                    throw robotConnectionException;
                }
            }
        }
    }
}
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection robotConnection = null;
//        for (int i = 0; i < 3; i++) {
//            try {
//                robotConnection = robotConnectionManager.getConnection();
//                robotConnection.moveRobotTo(toX, toY);
//                i = 3;
//            } catch (RobotConnectionException robotConnectionException) {
//                if (i == 2) {
//                    throw robotConnectionException;
//                }
//            } finally {
//                if (robotConnection != null) {
//                    try {
//                        robotConnection.close();
//                    } catch (RobotConnectionException rcex) {
//                    }
//                }
//            }
//        }
//    }
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        int count = 0;
//        while (count < 3) {
//            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
//                robotConnection.moveRobotTo(toX, toY);
//            } catch (RobotConnectionException robotConnectionException) {
//                count++;
//            }
//            if (count == 3) {
//                throw new RobotConnectionException("Connection failure");
//            }
//        }
//    }





