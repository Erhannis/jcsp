
  /*************************************************************************
  *                                                                        *
  *  JCSP ("CSP for Java") libraries                                       *
  *  Copyright (C) 1996-2001 Peter Welch and Paul Austin.                  *
  *                                                                        *
  *  This library is free software; you can redistribute it and/or         *
  *  modify it under the terms of the GNU Lesser General Public            *
  *  License as published by the Free Software Foundation; either          *
  *  version 2.1 of the License, or (at your option) any later version.    *
  *                                                                        *
  *  This library is distributed in the hope that it will be useful,       *
  *  but WITHOUT ANY WARRANTY; without even the implied warranty of        *
  *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU     *
  *  Lesser General Public License for more details.                       *
  *                                                                        *
  *  You should have received a copy of the GNU Lesser General Public      *
  *  License along with this library; if not, write to the Free Software   *
  *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307,  *
  *  USA.                                                                  *
  *                                                                        *
  *  Author contact: P.H.Welch@ukc.ac.uk                                   *
  *                                                                        *
  *************************************************************************/

// package jcsp.lang;

//{{{  javadoc
/**
 * This defines the interface for poisoning channels and other sycnronisation objects.
 * <H2>Description</H2>
 * <TT>Poisonable</TT> defines the interface for ...
 * <P>
 * It is included for completeness.  Usually, when needing a channel interface,
 * we will know whether it's to be used for input or output and, therefore,
 * should use the restricted interface rather than this one.
 *
 * @see jcsp.lang.ChannelInput
 * @see jcsp.lang.ChannelOutput
 * @author P.H.Welch
 */
//}}}

public interface Poisonable {

  public void poison ();

  public void poison (final int level);

}
