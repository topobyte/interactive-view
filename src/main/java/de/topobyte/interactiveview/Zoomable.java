// Copyright 2016 Sebastian Kuerten
//
// This file is part of interactive-view.
//
// interactive-view is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// interactive-view is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with interactive-view. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.interactiveview;

public interface Zoomable
{

	public boolean canZoomIn();

	public boolean canZoomOut();

	public void zoomIn();

	public void zoomOut();

}
