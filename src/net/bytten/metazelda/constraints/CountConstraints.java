package net.bytten.metazelda.constraints;

import net.bytten.metazelda.Coords;
import net.bytten.metazelda.IDungeonConstraints;

public class CountConstraints implements IDungeonConstraints {

    protected final int numSpaces, numKeys;
    
    public CountConstraints(int numSpaces, int numKeys) {
        this.numSpaces = numSpaces;
        this.numKeys = numKeys;
    }
    
    @Override
    public int numberSpaces() {
        return numSpaces;
    }
    
    @Override
    public boolean validRoomCoords(Coords c) {
        return true;
    }

    @Override
    public Coords initialCoords() {
        return new Coords(0,0);
    }

    @Override
    public int numberKeys() {
        return numKeys;
    }

}