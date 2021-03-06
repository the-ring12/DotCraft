package com.rocbirds.dotcraft;

/**
 * Created by yangpeng on 1/20/22.
 */
class Level2 implements Level {

    private final int[] dotArr = new int[9];
    private final int[] containerArr = new int[9];

    public Level2() {
        dotArr[0] = 1;
        dotArr[5] = 1;
        dotArr[6] = 1;
        dotArr[7] = 1;

        containerArr[0] = 1;
        containerArr[2] = 1;
        containerArr[5] = 1;
        containerArr[4] = 1;
    }

    @Override
    public int[] getDotArray() {
        return dotArr;
    }

    @Override
    public int[] getContainerArray() {
        return containerArr;
    }

}
