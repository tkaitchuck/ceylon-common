/*
 * Copyright Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the authors tag. All rights reserved.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License version 2.
 * 
 * This particular file is subject to the "Classpath" exception as provided in the 
 * LICENSE file that accompanied this code.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License,
 * along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package com.redhat.ceylon.common.tools.help;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.redhat.ceylon.common.Messages;
import com.redhat.ceylon.common.tool.Tools;

public class CeylonHelpToolMessages extends Messages {

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(CeylonHelpToolMessages.class.getPackage().getName() + ".resources.sections");
    
    public static String msg(String msgKey, Object... msgArgs) {
        return Messages.msg(RESOURCE_BUNDLE, msgKey, msgArgs);
    }
    
    static String getMoreInfo() {
        return MessageFormat.format(CeylonHelpToolMessages.msg("more.info"), Tools.progName());   
    }
    
}