
import java.util.LinkedList;

public class Rover {

    private Point point;

    public void deploy(Point point) {
        this.point = point;
    }

    public Point run(Instruction instruction) {
        if (null == point) {
            throw new RuntimeException("请初始化坐标");
        }
        return instruction.execute(point);
    }

    public Point getPoint() {
        return point;
    }

    public Point run(LinkedList<Instruction> instructions) {
        if (null == point) {
            throw new RuntimeException("请初始化坐标");
        }
        instructions.forEach(instruction -> point = instruction.execute(point));
        return getPoint();
    }
}