package robot;

class RobotConnectionManagerImpl implements RobotConnectionManager {
    static int k = 0;
    public RobotConnection getConnection() { // бросает k эксепшенов тебе в метод
        System.err.println("k = " + k);
        if (k != 5) { // меняй как смотри что будет меняться, попробуй 3-ку и 2-ку
            throw new RobotConnectionException("" +  k);
        } else {
            return new Robot();
        }
    }
}
