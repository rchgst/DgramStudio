package dgramstudio.model.blocks;

public class ForBlock extends CompoundBlock{
    private String initialVariable = "i";
    private String stepVariable = "(1)";
    private String finalVariable = "N";

    public ForBlock(int blockNumber, BlockType type) {
        super(blockNumber, type);
    }

}
