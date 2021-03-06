/* Copyright (C) 2011 Alberto Romeu Carrasco
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,USA.
 *
 *   
 *   author: Alberto Romeu Carrasco (alberto@alrocar.es)
 */

package es.alrocar.map.vector.provider.observer;

import java.util.ArrayList;

import es.alrocar.map.vector.provider.driver.ProviderDriver;
import es.prodevelop.gvsig.mini.utiles.Cancellable;

/**
 * 
 * @author albertoromeu
 * 
 */
public interface VectorialProviderListener {

	public void onVectorDataRetrieved(int[] tile, ArrayList data,
			Cancellable cancellable, int zoomLevel);

	public void onRawDataRetrieved(int[] tile, Object data,
			Cancellable cancellable, ProviderDriver driver, int zoomLevel);

}
