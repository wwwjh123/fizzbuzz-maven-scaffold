public abstract class Move implements Instruction {

    private Area area;

    public Move(Area area) {
        this.area = area;
    }

    public boolean isCrossing(Point point) {
        if (!area.contains(point)) return true;
        else return false;
    }

    /**
     * 执行移动指令,执行完后需要校验是否超出指定区域
     *
     * @param point
     * @return
     */
    public abstract Point execute(Point point);

}