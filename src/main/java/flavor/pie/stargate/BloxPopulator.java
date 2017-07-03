/*
 * Stargate - A portal plugin for Bukkit
 * Copyright (C) 2011, 2012 Steven "Drakia" Scott <Contact@TheDgtl.net>
 * Copyright (C) 2017 Adam Spofford <pieflavor.mc@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package flavor.pie.stargate;

import org.spongepowered.api.block.BlockState;

public class BloxPopulator {
    private Blox blox;
    private BlockState nextMat;
    
    public BloxPopulator(Blox b, BlockState m) {
        blox = b;
        nextMat = m;
    }
    
    public void setBlox(Blox b) {
        blox = b;
    }
    
    public void setMat(BlockState m) {
        nextMat = m;
    }
    
    public Blox getBlox() {
        return blox;
    }
    
    public BlockState getMat() {
        return nextMat;
    }
    
}
